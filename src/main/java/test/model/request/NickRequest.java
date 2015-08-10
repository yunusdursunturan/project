package test.model.request;

import test.model.object.Telephone;

import java.util.Date;

/**
 * Created by yturan on 06/08/15.
 */
public class NickRequest {
    private Integer userId;
    private String nickName;
    private String email;
    private Boolean newUser;
    private Date kayitDate;
    private Date activeDate;
    private String password;
    private Telephone telephone;

    public NickRequest() {
    }

    public NickRequest(Integer userId, String nickName, String email, Boolean newUser, Date kayitDate, Date activeDate, String password, Telephone telephone) {
        this.userId = userId;
        this.nickName = nickName;
        this.email = email;
        this.newUser = newUser;
        this.kayitDate = kayitDate;
        this.activeDate = activeDate;
        this.password = password;
        this.telephone = telephone;
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

    @Override
    public String toString() {
        return "NickRequest{" +
                "userId=" + userId +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", newUser=" + newUser +
                ", kayitDate=" + kayitDate +
                ", activeDate=" + activeDate +
                ", password='" + password + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}
