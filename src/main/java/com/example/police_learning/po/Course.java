package com.example.police_learning.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_course")
public class Course {
    @Id
    @GeneratedValue
    private Long courseID;
    private String courseName;
    private String type;
    private String suggest;
    private String video;//视频地址

    public Course() {

    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Course(Long courseID, String courseName, String type, String suggest, String video) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.type = type;
        this.suggest = suggest;
        this.video = video;
    }
}
