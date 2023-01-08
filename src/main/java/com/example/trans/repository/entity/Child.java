package com.example.trans.repository.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "child")
public class Child {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Long parentId;
}
