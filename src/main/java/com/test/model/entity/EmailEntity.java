package com.test.model.entity;

/**
 * Created by yturan on 07/08/15.
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.google.common.base.Objects;

@Entity
@Table(name = "email" , catalog = "TestData")
public class EmailEntity {
    @Id
    @Column(name ="userId")
    private Integer userId;

    @Column(name = "email")
    private String email;

    @Column (name = "type")
    private String type;

    public EmailEntity() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailEntity)) return false;
        EmailEntity that = (EmailEntity) o;
        return Objects.equal(userId, that.userId) &&
                Objects.equal(email, that.email) &&
                Objects.equal(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userId, email, type);
    }
}
