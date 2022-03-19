package com.example.springbootdatajpa.service;

import com.example.springbootdatajpa.model.User;
import com.example.springbootdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initDB(){
        List<User> users = new ArrayList<>();
        users.add(new User(111, "Amit","IT",32));
        users.add(new User(112, "Mahesh","IT",33));
        users.add(new User(113, "Suresh","IT",34));
        repository.saveAll(users);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User saveUser(User user){
        return repository.save(user);
    }
}
