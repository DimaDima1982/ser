package com.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "FieldMap")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FieldMap {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;


    @OneToOne
    @JoinColumn(name = "id")
    private TabMapXLSX tabMapXLSX;


    @Column(name = "xlsxField")
    private String xlsxField;


    @Column(name = "tableField")
    private String tableField;
}
