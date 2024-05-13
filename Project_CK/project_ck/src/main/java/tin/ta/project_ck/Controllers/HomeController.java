package tin.ta.project_ck.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tin.ta.project_ck.Models.StudentModel;
import tin.ta.project_ck.Repo.SinhVienRepo;
@Controller

@RequestMapping("/students")
public class HomeController {
	@Autowired
    private SinhVienRepo sinhVienRepository;
	@GetMapping("/")
	public String getAll(Model model) {
		Iterable<StudentModel> students = sinhVienRepository.findAll();
        model.addAttribute("students", students);
        return "index";
	}
}