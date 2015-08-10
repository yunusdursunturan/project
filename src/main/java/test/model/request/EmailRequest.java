package test.model.request;

import java.util.Date;

/**
 * Created by yturan on 06/08/15.
 */
public class EmailRequest {
    private Integer userId;
    private Date addDate;
    private String type;
    private String email;
    private Boolean newUser;

    public EmailRequest() {
    }

    public EmailRequest(Integer userId, Date addDate, String type, String email, Boolean newUser) {
        this.userId = userId;
        this.addDate = addDate;
        this.type = type;
        this.email = email;
        this.newUser = newUser;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "EmailRequest{" +
                "userId=" + userId +
                ", addDate=" + addDate +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", newUser=" + newUser +
                '}';
    }
}
