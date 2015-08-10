package com.test.model.type;

import java.util.Date;
import com.test.model.object.Telephone;
/**
 * Created by yturan on 06/08/15.
 */
public class NickType {
    private Integer userId;
    private String nickName;
    private String email;
    private Boolean newUser;
    private Date kayitDate;
    private Date activeDate;
    private String password;
    private Telephone telephone;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getNewUser() {
        return newUser;
    }

    public void setNewUser(Boolean newUser) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }
}
