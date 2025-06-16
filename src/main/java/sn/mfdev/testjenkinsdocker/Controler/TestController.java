package sn.mfdev.testjenkinsdocker.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/hello-develop")
    public String helloDevelop() {
        return "helloDevelop";
    }
}
