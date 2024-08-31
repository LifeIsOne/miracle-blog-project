package miracleblog.domain.view;

import jakarta.persistence.*;
import miracleblog.domain.post.Post;
import miracleblog.domain.user.User;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "view_tb")
public class View { // 조회수

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;             // PK

    @OneToOne
    @JoinColumn(name = "postId")
    private Post post;              // 게시글 ID

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;              // 조회한 사용자

//    @Column(nullable = false)
//    private String ip;            // IP 주소

    private Long viewCount;         // 조회수

    @CreationTimestamp
    private Timestamp createdAt;    // 생성시각
    @UpdateTimestamp
    private Timestamp updatedAt;    // 수정시각
}
