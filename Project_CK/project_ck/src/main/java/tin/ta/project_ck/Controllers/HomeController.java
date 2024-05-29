package tin.ta.project_ck.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import tin.ta.project_ck.Models.StudentModel;
import tin.ta.project_ck.Models.ScoreModel;
import tin.ta.project_ck.Repo.MonHocRepo;
import tin.ta.project_ck.Repo.ScoreRepo;
import tin.ta.project_ck.Repo.SinhVienRepo;
import tin.ta.project_ck.Services.StudentServiceImpl;

@Controller
public class HomeController {

    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private MonHocRepo monHocRepo;
    @Autowired
    private SinhVienRepo sinhVienRepo;
    @Autowired
    private ScoreRepo scoreRepo;
    @GetMapping("/")
    public String home(Model model) {
        List<StudentModel> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "index";
    }
 
    @GetMapping("/themSV")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new StudentModel());
        model.addAttribute("subjects", monHocRepo.findAll());
        return "themSV";
    }
    
    @PostMapping("/students/save")
    public String saveStudent( @ModelAttribute("student") StudentModel student, 
    BindingResult result, Model model) {
    if (result.hasErrors()) {
        model.addAttribute("subjects", monHocRepo.findAll());
        return "themSV";
    }
    for (ScoreModel grade : student.getGrades()) {
        grade.setStudent(student);
        scoreRepo.save(grade);
    }
    
    sinhVienRepo.save(student);
    return "redirect:/";
}
}
