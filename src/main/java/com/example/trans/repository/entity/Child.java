package com.example.trans.repository.entity;

import jakarta.persistence.*;
import lombok.*;

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
