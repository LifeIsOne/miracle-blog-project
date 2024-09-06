package miracleblog.domain.user;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SessionUser {

    private final Integer id;

    @Builder
    public SessionUser(User user) {
        this.id = user.getId();
    }
}
