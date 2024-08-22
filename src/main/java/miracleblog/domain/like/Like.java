package miracleblog.domain.like;

import jakarta.persistence.*;
import miracleblog.domain.post.Post;
import miracleblog.domain.user.User;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "like_tb")
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Post post;              // 좋아요 한 게시물

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;              // 좋아요 한 사용자

    @CreationTimestamp
    private Timestamp createdAt;    // 생성시각
    @UpdateTimestamp
    private Timestamp updatedAt;    // 수정시각
}
