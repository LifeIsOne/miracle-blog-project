package miracleblog.domain.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "user_tb")
@RequiredArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;             // PK

    private String username;        // 사용자 이름
    private String email;           // 이메일, ( 로그인ID )
    private String password;        // 비밀번호

    @CreationTimestamp
    private Timestamp createdAt;    // 생성시각
    @UpdateTimestamp
    private Timestamp updatedAt;    // 수정시각

    @Builder
    public User(Integer id, String username, String email, String password, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
