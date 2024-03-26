package thiGK.ntu63132691.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu63132691.models.SinhVien;
@Controller
public class ThemMoiController {
	@GetMapping("/themMoiSV")
	public String showForm(Model mm) {
        SinhVien sinhvienNull = new SinhVien();
        mm.addAttribute("svDTO", sinhvienNull);
        return "themSinhVien_form";
    }
	@PostMapping("/themMoiSV")
	public String submitForm(@ModelAttribute("svDTO") SinhVien sv) {
	    return "themSinhVien_OK";
	}
}
