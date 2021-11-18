package com.example.police_learning.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_information")
public class Information {
    @Id
    @GeneratedValue
    private Long informationID;
    private String title;
    private String content;
    private String picture;//图片地址
    private Integer view;
    private String comment;
    private boolean top;

    public boolean isTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    @Temporal(TemporalType.DATE)//该注解中地参数可以修改时间的格式
    @CreatedDate
    private Date creatTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Information() {

    }

    public Long getInformationID() {
        return informationID;
    }

    public void setInformationID(Long informationID) {
        this.informationID = informationID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Information(Long informationID, String content, String picture) {
        this.informationID = informationID;
        this.content = content;
        this.picture = picture;
    }
}
