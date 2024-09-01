package miracleblog.domain.user;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class UserController {
    private final HttpSession httpSession;
    private final UserService userService;


    @GetMapping("/")
    public String getMainPage() {
        return "/main";
    }

    // 로그인 페이지
    @GetMapping("/login")
    public String getLoginPage() {
        return "user/login-page";
    }

    // 로그인
    @PostMapping("/login")
    public String postLogin(UserRequest.LoginDTO reqDTO){
        log.info("로그인 요청 : " + reqDTO);
        User user = userService.login(reqDTO);

        log.info("User : " + user);
        return "redirect:/";
    }

    // 회원가입 페이지
    @GetMapping("/signup")
    public String getSignupPage() {
        return "user/signup-page";
    }

    @PostMapping("/signup")
    public String postSignup(UserRequest.SignupDTO reqDTO){
        userService.signup(reqDTO);

        return "redirect:/";
    }


    @GetMapping("/err")
    public String errPage() {
        return "err/err";
    }
}
