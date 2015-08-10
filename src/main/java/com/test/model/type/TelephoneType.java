package com.test.model.type;
import com.test.model.object.Telephone;
/**
 * Created by yturan on 06/08/15.
 */
public class TelephoneType {
    private Integer userId;
    private Telephone telephone;
    private Boolean active;


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
}
