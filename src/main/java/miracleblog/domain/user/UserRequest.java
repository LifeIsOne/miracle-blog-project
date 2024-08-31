package miracleblog.domain.user;

import lombok.Data;

public class UserRequest {

    // 로그인 DTO
    @Data
    public static class LoginDTO{
        private String email;
        private String password;
    }
}
