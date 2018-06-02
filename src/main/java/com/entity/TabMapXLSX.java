package com.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "TabMapXLSXDao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TabMapXLSX {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nameXLSXPref")
    private String nameXLSXPref;

    @Column(name = "nameTable")
    private String nameTable;
}
