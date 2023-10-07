package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long skill_id;

    @NonNull
    @Column(name = "skill_description", columnDefinition = "VARCHAR(255)")
    private String skill_description;

    @NonNull
    @Column(name = "skill_name", columnDefinition = "VARCHAR(255)")
    private String skill_name;

    @NonNull
    @Column(name = "type", columnDefinition = "TINYINT(4)")
    private String type;
}
