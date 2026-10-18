package com.backend.Caching.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    Long id;

    @Column(unique = true)
    String email;

    String name;

    Long salary;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    Department department;

}
