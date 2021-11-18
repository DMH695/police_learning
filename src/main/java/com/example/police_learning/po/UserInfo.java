package com.example.police_learning.po;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Entity
@Table(name = "userinfo")
@Data
public class UserInfo {
    @EmbeddedId
    private UserKey userKey;
    @GeneratedValue
    private boolean iscollect;
    private String comment;

}
