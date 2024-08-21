package miracleblog.domain.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @GetMapping("/")
    public String getMainPage() {
        return "/main";
    }
    @GetMapping("/login")
    public String getLoginPage() {
        return "user/login";
    }
}
