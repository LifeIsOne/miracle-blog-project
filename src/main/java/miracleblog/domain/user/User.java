package miracleblog.domain.user;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "user_tb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;             // PK

    private String username;        // 사용자 이름
    private String email;           // 이메일, 로그인ID
    private String password;        // 비밀번호

    @CreationTimestamp
    private Timestamp createdAt;    // 생성일
}
