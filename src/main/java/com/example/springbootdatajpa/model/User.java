package com.example.springbootdatajpa.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class User{
    @Id
    private int id;
    private String name;
    private String profession;
    private int age;

}
