package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "adresss")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private long address_id;

    @NonNull
    @Column(name = "street", columnDefinition = "VARCHAR(150)")
    private String street;

    @NonNull
    @Column(name = "city", columnDefinition = "VARCHAR50")
    private String city;

    @NonNull
    @Column(name = "country", columnDefinition = "SMALLINT(6)")
    private int country;

    @NonNull
    @Column(name = "number", columnDefinition = "VARCHAR(20)")
    private String number;

    @NonNull
    @Column(name = "zipcode", columnDefinition = "VARCHAR(7)")
    private String zipcode;

    @OneToOne(mappedBy = "address")
    private Company company;
}
