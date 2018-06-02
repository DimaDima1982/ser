package com.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ValidationManualData")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ValidationManualData {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id")
    private Validation validation;

    @Column(name = "sqlText")
    private String sqlText;

}
