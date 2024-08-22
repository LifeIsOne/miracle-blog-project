package miracleblog.domain.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String getMainPage() {
        return "/main";
    }

    // 로그인
    @GetMapping("/login")
    public String getLoginPage() {
        return "user/login-page";
    }

    @PostMapping("/login")
    public String postLogin(){
        return "redirect:/";
    }

    // TODO : 회원가입 페이지 만들기
    @GetMapping("/signup")
    public String getSignupPage() {
        return "user/sign-page";
    }
}
