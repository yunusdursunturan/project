package test.model.entity;

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
@Table(name = "telefon" ,catalog = "TestData")
public class TelefonEntity {
    @Id
    @Column(name = "telefonId")
    private Integer telefonId;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "alanKodu")
    private Integer alanKodu;

    @Column(name = "number")
    private Integer number;

    @Column(name = "active")
    private String active;

    public TelefonEntity() {
    }

    public Integer getTelefonId() {
        return telefonId;
    }

    public void setTelefonId(Integer telefonId) {
        this.telefonId = telefonId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAlanKodu() {
        return alanKodu;
    }

    public void setAlanKodu(Integer alanKodu) {
        this.alanKodu = alanKodu;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
        if (!(o instanceof TelefonEntity)) return false;
        TelefonEntity that = (TelefonEntity) o;
        return Objects.equal(telefonId, that.telefonId) &&
                Objects.equal(userId, that.userId) &&
                Objects.equal(alanKodu, that.alanKodu) &&
                Objects.equal(number, that.number) &&
                Objects.equal(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(telefonId, userId, alanKodu, number, active);
    }
}
