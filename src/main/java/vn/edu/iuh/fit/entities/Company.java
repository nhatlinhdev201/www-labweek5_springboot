package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "company")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_id")
    private long comp_id;

    @NonNull
    @Column(name = "about", columnDefinition = "VARCHAR(2000)")
    private String about;

    @NonNull
    @Column(name = "email", columnDefinition = "VARCHAR(255")
    private String email;

    @NonNull
    @Column(name = "comp_name")
    private String comp_name;

    @NonNull
    @Column(name = "phone")
    private String phone;

    @NonNull
    @Column(name = "web_ul")
    private String web_url;

    @OneToOne(mappedBy = "company")
    private Address address;

    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Job> lstJob;
}
