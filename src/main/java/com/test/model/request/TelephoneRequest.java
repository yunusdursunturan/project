package com.test.model.request;

import com.test.model.object.Telephone;

/**
 * Created by yturan on 06/08/15.
 */
public class TelephoneRequest {
    private Integer userId;
    private Telephone telephone;
    private Boolean active;

    public TelephoneRequest() {
    }

    public TelephoneRequest(Integer userId, Telephone telephone, Boolean active) {
        this.userId = userId;
        this.telephone = telephone;
        this.active = active;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "TelephoneRequest{" +
                "userId=" + userId +
                ", telephone=" + telephone +
                ", active=" + active +
                '}';
    }
}
