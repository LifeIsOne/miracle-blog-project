package miracleblog.domain.post;

import jakarta.persistence.*;
import miracleblog.domain.user.User;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "post_tb")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;         // PK

    private String title;       // 제목
    private String content;     // 내용

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;          // 작성자

    @CreationTimestamp
    private Timestamp createdAt;  // 작성일
}
