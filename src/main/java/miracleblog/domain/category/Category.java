package miracleblog.domain.category;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "category_tb")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;             // PK

    private String name;            // 카테고리 이름

    @CreationTimestamp
    private Timestamp createdAt;    // 생성시각
    @UpdateTimestamp
    private Timestamp updatedAt;    // 수정시각
}
