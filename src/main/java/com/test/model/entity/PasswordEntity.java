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
@Table(name = "passwords" ,catalog = "TestData")
public class PasswordEntity {
    @Id
    @Column(name = "passId")
    private Integer passwordId;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "createDate")
    private Date createDate;

    @Column(name = "password")
    private String password;

    @Column(name = "active")
    private String active;

    public PasswordEntity() {
    }

    public Integer getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(Integer passwordId) {
        this.passwordId = passwordId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PasswordEntity)) return false;
        PasswordEntity that = (PasswordEntity) o;
        return Objects.equal(passwordId, that.passwordId) &&
                Objects.equal(userId, that.userId) &&
                Objects.equal(createDate, that.createDate) &&
                Objects.equal(password, that.password) &&
                Objects.equal(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(passwordId, userId, createDate, password, active);
    }
}
