package sn.mfdev.testjenkinsdocker.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {


    @GetMapping("/hello-develop")
    public String helloDevelop() {
        return "helloDevelop";
    }
}
