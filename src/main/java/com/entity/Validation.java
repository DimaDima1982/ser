package com.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Validation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Validation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id")
    private TabMapXLSX tabMapXLSX;

    @OneToOne
    @JoinColumn(name = "id")
    private FieldMap fieldMap;

    @OneToOne
    @JoinColumn(name = "id")
    private ValidationsType validationsType;

}
