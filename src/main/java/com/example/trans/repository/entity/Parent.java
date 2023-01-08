package com.example.trans.repository.entity;

import lombok.*;

import javax.persistence.*;


@Builder
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "parent", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" }) })
public class Parent {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

}
