package grupo15;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @GetMapping("/**")
    public String home(@RequestParam (name="name",required = false, defaultValue = "Seguridad Software") String name,Model model) {
        model.addAttribute("name",name);
        return "Home";
    }

    @GetMapping("/")
    public String root(@RequestParam (name="name",required = false, defaultValue = "Seguridad y Calidad en Desarrollo") String name,Model model) {
        model.addAttribute("name",name);
        return "Home";
    }
    
}
