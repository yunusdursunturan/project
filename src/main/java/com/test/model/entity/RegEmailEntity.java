package com.test.model.entity;

/**
 * Created by yturan on 07/08/15.
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.google.common.base.Objects;

import java.util.Date;

@Entity
@Table(name = "regEmail",catalog = "TestData")
public class RegEmailEntity {
    @Id
    @Column(name = "emailId")
    private Integer emailId;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "addDate")
    private Date addDate;

    @Column(name = "email")
    private String email;

    @Column(name = "newUser")
    private String newUser;

    public RegEmailEntity() {
    }

    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNewUser() {
        return newUser;
    }

    public void setNewUser(String newUser) {
        this.newUser = newUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegEmailEntity)) return false;
        RegEmailEntity that = (RegEmailEntity) o;
        return Objects.equal(emailId, that.emailId) &&
                Objects.equal(userId, that.userId) &&
                Objects.equal(addDate, that.addDate) &&
                Objects.equal(email, that.email) &&
                Objects.equal(newUser, that.newUser);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(emailId, userId, addDate, email, newUser);
    }
}
