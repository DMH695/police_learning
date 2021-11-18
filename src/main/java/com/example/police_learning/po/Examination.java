package com.example.police_learning.po;

import com.sun.tracing.dtrace.ModuleName;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "examination")
public class Examination {
    @Id
    @GeneratedValue
    private Long examinationID;
    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Topic> topics = new ArrayList<>();

    public Examination() {

    }

    public Long getExaminationID() {
        return examinationID;
    }

    public void setExaminationID(Long examinationID) {
        this.examinationID = examinationID;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public Examination(Long examinationID) {
        this.examinationID = examinationID;
    }
}
