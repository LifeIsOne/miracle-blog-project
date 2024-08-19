package miracleblog.domain.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;             // PK

    private String username;        // 사용자 이름
    private String password;        // 비밀번호

    @CreationTimestamp
    private Timestamp createdAt;    // 생성일
}
