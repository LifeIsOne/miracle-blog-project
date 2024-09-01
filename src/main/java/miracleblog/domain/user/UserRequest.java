package miracleblog.domain.user;

import lombok.Data;

public class UserRequest {

    // 로그인 DTO
    @Data
    public static class LoginDTO{
        private String email;
        private String password;
    }

    // 회원가입 DTO
    @Data
    public static class SignupDTO {
        private String email;
        private String username;
        private String password;


        public User toEntity() {
            return User.builder()
                    .email(email)
                    .username(username)
                    .password(password)
                    .build();
        }
    }
}
