package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long job_id;

    @NonNull
    @Column(name = "job_desc", columnDefinition = "VARCHAR(2000)")
    private String jop_desc;

    @NonNull
    @Column(name = "job_name", columnDefinition = "VARCHAR(255)")
    private String jop_name;

    @ManyToOne()
    @JoinColumn(name = "comp_id")
    private Company company;
}
