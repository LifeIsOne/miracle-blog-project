package miracleblog.domain.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // 로그인
    public User login(UserRequest.LoginDTO requestDTO){
        User user = userRepository.findByEmail(requestDTO.getEmail());

        return user;
    }
}
