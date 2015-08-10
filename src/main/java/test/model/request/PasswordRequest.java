package test.model.request;

import java.util.Date;

/**
 * Created by yturan on 06/08/15.
 */
public class PasswordRequest {
    private Integer userId;
    private String pass;
    private Boolean active;
    private Date createDate;

    public PasswordRequest() {
    }

    public PasswordRequest(Integer userId, String pass, Boolean active, Date createDate) {
        this.userId = userId;
        this.pass = pass;
        this.active = active;
        this.createDate = createDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "PasswordRequest{" +
                "userId=" + userId +
                ", pass='" + pass + '\'' +
                ", active=" + active +
                ", createDate=" + createDate +
                '}';
    }
}
