package tin.ta.project_ck.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tin.ta.project_ck.Models.StudentModel;
@Controller
@RequestMapping("/students")
public class HomeController {
	@GetMapping("/all")
	public String getAll(Model model) {
		return "index";
	}
}