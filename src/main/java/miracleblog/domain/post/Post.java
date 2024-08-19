package miracleblog.domain.post;

import jakarta.persistence.*;
import miracleblog.domain.user.User;

import java.sql.Timestamp;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;         // PK

    private String title;       // 제목
    private String content;     // 내용

    @ManyToOne
    private User user;          // 작성자

    private Timestamp created;  // 작성일
}
