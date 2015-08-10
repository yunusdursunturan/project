package test.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.google.common.base.Objects;

import java.util.Date;

/**
 * Created by yturan on 07/08/15.
 */
@Entity
@Table(name = "nick" , catalog = "TestData")
public class NickEntity {
    @Id
    @Column(name = "userId")
    private Integer userId;

    @Column(name="nickName")
    private String nickName;

    @Column(name = "emailId")
    private Integer emailId;

    @Column(name = "newUser")
    private  String newUser;

    @Column(name="kayitDate")
    private Date kayitDate;

    @Column(name = "activeDate")
    private Date activeDate;

    @Column(name = "paswordId")
    private Integer passwordId;

    @Column(name = "telefonId")
    private Integer telefonId;

    public NickEntity() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NickEntity)) return false;
        NickEntity that = (NickEntity) o;
        return Objects.equal(userId, that.userId) &&
                Objects.equal(nickName, that.nickName) &&
                Objects.equal(emailId, that.emailId) &&
                Objects.equal(newUser, that.newUser) &&
                Objects.equal(kayitDate, that.kayitDate) &&
                Objects.equal(activeDate, that.activeDate) &&
                Objects.equal(passwordId, that.passwordId) &&
                Objects.equal(telefonId, that.telefonId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userId, nickName, emailId, newUser, kayitDate, activeDate, passwordId, telefonId);
    }
}
