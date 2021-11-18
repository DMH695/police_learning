package com.example.police_learning.po;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
//构建复合主键的类，必须要实现Serializable接口，要有注解Embeddable，要有无参构造方法，要重写equals方法和hashcode
@Embeddable
@EqualsAndHashCode
public class UserKey implements Serializable {
    @Column(name = "account")
    private String account;
    @Column(name = "informationID")
    private Long informationID;
    // 省略setter,getter方法


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Long getInformationID() {
        return informationID;
    }

    public void setInformationID(Long informationID) {
        this.informationID = informationID;
    }

    @Override
    public String toString() {
        return "UserKey{" +
                "account='" + account + '\'' +
                ", informationID=" + informationID +
                '}';
    }
}
