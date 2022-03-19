package com.example.springbootdatajpa.repository;

import com.example.springbootdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {

}
