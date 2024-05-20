package tin.ta.project_ck.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DSController {

    @GetMapping("/ds") // Định nghĩa URL mà bạn muốn xử lý
    public String themMoi() {
        return "index";
    }
}