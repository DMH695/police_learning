package com.example.police_learning.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_law")
public class Law {
    @Id
    @GeneratedValue
    private Long lawID;
    private String content;
    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<User>  users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Law() {

    }

    public Long getLawID() {
        return lawID;
    }

    public void setLawID(Long lawID) {
        this.lawID = lawID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Law(Long lawID, String content) {
        this.lawID = lawID;
        this.content = content;
    }
}
