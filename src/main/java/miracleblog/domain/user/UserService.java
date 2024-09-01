package miracleblog.domain.user;

import lombok.RequiredArgsConstructor;
import miracleblog.domain._core.error.exception.Exception404;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // 로그인
    public User login(UserRequest.LoginDTO requestDTO) {
        User user = userRepository.findByEmail(requestDTO.getEmail())
                .orElseThrow(() -> new Exception404("입력한 이메일 정보가 없습니다."));

        return user;
    }
}
