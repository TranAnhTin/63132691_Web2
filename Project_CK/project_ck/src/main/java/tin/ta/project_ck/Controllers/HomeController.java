package tin.ta.project_ck.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tin.ta.project_ck.Models.StudentModel;
import tin.ta.project_ck.Models.MonHocModel;
import tin.ta.project_ck.Models.ScoreModel;
import tin.ta.project_ck.Repo.MonHocRepo;
import tin.ta.project_ck.Repo.ScoreRepo;
import tin.ta.project_ck.Repo.SinhVienRepo;
import tin.ta.project_ck.Services.MonHocServiceImpl;
import tin.ta.project_ck.Services.StudentServiceImpl;

@Controller
public class HomeController {

    @Autowired
    private StudentServiceImpl studentService;

    // bỏ repo thay bằng service hết

    @Autowired
    private MonHocRepo monHocRepo;
    @Autowired
    private SinhVienRepo sinhVienRepo;
    @Autowired
    private StudentServiceImpl studentServiceImpl;
    @GetMapping("/")
    public String home(Model model) {
        List<StudentModel> students = studentServiceImpl.getAllStudents();
        model.addAttribute("students", students);
        return "index";
    }
 
    @GetMapping("/themSV")
    public String showCreateForm(Model model) {
        StudentModel student = new StudentModel();
        List<MonHocModel> subjects = monHocRepo.findAll();
        
        // Khởi tạo danh sách ScoreModel và gán môn học tương ứng
        List<ScoreModel> scores = new ArrayList<>();
        for (MonHocModel subject : subjects) {
            ScoreModel score = new ScoreModel();
            score.setSubject(subject);
            scores.add(score);
        }
        student.setGrades(scores);
        
        model.addAttribute("student", student);
        model.addAttribute("subjects", subjects);
        return "themSV";
    }
    
    @PostMapping("/students/save")
    public String saveStudent(@ModelAttribute("student") StudentModel student, 
                            BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("subjects", monHocRepo.findAll());
            return "themSV";
        }
        for (ScoreModel score : student.getGrades()) {
            score.setStudent(student);
        }
        // Lưu StudentModel và các ScoreModel liên quan
        sinhVienRepo.save(student);
        
        return "redirect:/";
    }
    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
        return "redirect:/"; // Redirect back to the home page after deleting
    }

    @GetMapping("/editSV/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        StudentModel student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "editStudent";
    }

    @PostMapping("/updateSV/{id}")
    public String updateStudent(@PathVariable("id") Long id, @ModelAttribute("student") StudentModel updatedStudent) {
        studentServiceImpl.updateStudent(id, updatedStudent);
        return "redirect:/";
    }
}