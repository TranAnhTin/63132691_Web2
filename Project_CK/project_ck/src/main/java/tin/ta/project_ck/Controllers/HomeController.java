package tin.ta.project_ck.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import tin.ta.project_ck.Models.StudentModel;
import tin.ta.project_ck.Services.StudentServiceImpl;

@Controller
public class HomeController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/them")
    public String themMoi() {
        return "themSV";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(StudentModel student) {
        studentService.saveStudent(student);
        return "redirect:/ds";
    }

    @GetMapping("/ds")
    public String danhSachSinhVien(Model model) {
        List<StudentModel> list = studentService.getAllStudents();
        model.addAttribute("students", list);
        return "dsSV";
    }
}
