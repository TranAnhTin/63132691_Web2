package thiGK.ntu63132691.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import thiGK.ntu63132691.models.SinhVien;
public class DSSinhVienController {
	static List<SinhVien> dsSinhVien=  new ArrayList<SinhVien>();
	static {
			dsSinhVien.add(new SinhVien("0001", "Trần Anh Tín","7"));
			dsSinhVien.add(new SinhVien("0002", "Trần Văn Long","8"));
		 }
	//----------hết phần hard-code dữ liệu ---------------------	
	@GetMapping("/danhsachSV")
	public String listStudent(ModelMap mm) {
	    mm.addAttribute("dsSV", dsSinhVien);
	    return "DSSinhVien";
	}
}
