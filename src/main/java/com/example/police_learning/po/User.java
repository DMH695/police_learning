package com.example.police_learning.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue
    private String account;
    private String password;
    private String nickname;
    private String avatar;//头像的地址
    private Long courseID;//暂时没用
    private Long examinationID;
    private Long topicID;//题目
    private Long informationID;
    private Long lawID;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Topic> topics = new ArrayList<>();

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Information> information = new ArrayList<>();

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Law> laws = new ArrayList<>();

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public List<Information> getInformation() {
        return information;
    }

    public void setInformation(List<Information> information) {
        this.information = information;
    }

    public List<Law> getLaws() {
        return laws;
    }

    public void setLaws(List<Law> laws) {
        this.laws = laws;
    }

    public User() {

    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    public Long getExaminationID() {
        return examinationID;
    }

    public void setExaminationID(Long examinationID) {
        this.examinationID = examinationID;
    }

    public Long getTopicID() {
        return topicID;
    }

    public void setTopicID(Long topicID) {
        this.topicID = topicID;
    }

    public Long getInformationID() {
        return informationID;
    }

    public void setInformationID(Long informationID) {
        this.informationID = informationID;
    }

    public Long getLawID() {
        return lawID;
    }

    public void setLawID(Long lawID) {
        this.lawID = lawID;
    }

    public User(String account, String password, String nickname, String avatar, Long courseID, Long examinationID, Long topicID, Long informationID, Long lawID) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
        this.courseID = courseID;
        this.examinationID = examinationID;
        this.topicID = topicID;
        this.informationID = informationID;
        this.lawID = lawID;
    }
}
