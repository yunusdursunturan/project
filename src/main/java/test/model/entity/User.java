package test.model.entity;

/**
 * Created by yturan on 11/08/15.
 */
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.google.common.base.Objects;
import test.dao.UserDao;
import test.model.type.UserType;

import java.util.Date;

@Entity
@Table(name = "nick", catalog = "TestData")
public class User {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column(name = "nickName")
    private String nickName;

    @Column(name = "emailId")
    private Integer emailId;

    @Column(name = "newUser")
    private String newUser;

    @Column(name = "kayitDate")
    private Date kayitDate;

    @Column(name = "activeDate")
    private Date activeDate;

    @Column(name = "passwordId")
    private Integer passwordId;

    @Column(name = "telefonId")
    private Integer telefonId;

    public User() {
    }

    public User(String nickName, Integer emailId, String newUser, Date kayitDate, Date activeDate, Integer passwordId, Integer telefonId) {
        this.nickName = nickName;
        this.emailId = emailId;
        this.newUser = newUser;
        this.kayitDate = kayitDate;
        this.activeDate = activeDate;
        this.passwordId = passwordId;
        this.telefonId = telefonId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public String getNewUser() {
        return newUser;
    }

    public void setNewUser(String newUser) {
        this.newUser = newUser;
    }

    public Date getKayitDate() {
        return kayitDate;
    }

    public void setKayitDate(Date kayitDate) {
        this.kayitDate = kayitDate;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public Integer getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(Integer passwordId) {
        this.passwordId = passwordId;
    }

    public Integer getTelefonId() {
        return telefonId;
    }

    public void setTelefonId(Integer telefonId) {
        this.telefonId = telefonId;
    }
}
