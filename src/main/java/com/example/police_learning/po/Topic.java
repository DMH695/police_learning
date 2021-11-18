package com.example.police_learning.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_topic")
public class Topic {
    @Id
    @GeneratedValue
    private Long topicID;
    private String content;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<User> users = new ArrayList<>();
    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Examination> examinations = new ArrayList<>();

    public List<Examination> getExaminations() {
        return examinations;
    }

    public void setExaminations(List<Examination> examinations) {
        this.examinations = examinations;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Topic() {

    }

    public Long getTopicID() {
        return topicID;
    }

    public void setTopicID(Long topicID) {
        this.topicID = topicID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Topic(Long topicID, String content) {
        this.topicID = topicID;
        this.content = content;
    }
}
