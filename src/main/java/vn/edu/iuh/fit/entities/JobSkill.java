package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "job_skill")
public class JobSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long skill_id;

    @NonNull
    @Column(name = "more_infos", columnDefinition = "VARCHAR(1000)")
    private String more_infos;

    @NonNull
    @Column(name = "skill_level", columnDefinition = "TINYINT(4)")
    private int skill_level;


}
