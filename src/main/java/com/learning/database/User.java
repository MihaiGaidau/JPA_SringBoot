package com.learning.database;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name="USERS")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private boolean disabled;

    public User()
    {

    }

    public User(Integer id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public User(Integer id, String name, String email, boolean disabled)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.disabled = disabled;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public boolean getDisabled(){
        return disabled;
    }





}
