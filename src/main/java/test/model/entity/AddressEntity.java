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
@Table(name="address",catalog = "TestData")
public class AddressEntity {
    @Id
    @Column(name = "addressId")
    private Integer id;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "ilCode")
    private Integer ilCode;

    @Column (name = "ilceCode")
    private Integer ilceCode;

    @Column(name = "semtCode")
    private Integer semtCode;

    @Column(name = "mahalle")
    private String mahalle;

    @Column(name = "detay")
    private String detay;

    @Column(name = "telefon")
    private String telefon;

    @Column(name = "postaCode")
    private Integer postaCode;

    @Column(name = "active")
    private Integer active;

    @Column(name = "default")
    private Integer def;

    @Column(name = "addDate")
    private Date addDate;

    public AddressEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIlCode() {
        return ilCode;
    }

    public void setIlCode(Integer ilCode) {
        this.ilCode = ilCode;
    }

    public Integer getIlceCode() {
        return ilceCode;
    }

    public void setIlceCode(Integer ilceCode) {
        this.ilceCode = ilceCode;
    }

    public Integer getSemtCode() {
        return semtCode;
    }

    public void setSemtCode(Integer semtCode) {
        this.semtCode = semtCode;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Integer getPostaCode() {
        return postaCode;
    }

    public void setPostaCode(Integer postaCode) {
        this.postaCode = postaCode;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
    public Integer getDef() {

        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressEntity)) return false;
        AddressEntity that = (AddressEntity) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(userId, that.userId) &&
                Objects.equal(ilCode, that.ilCode) &&
                Objects.equal(ilceCode, that.ilceCode) &&
                Objects.equal(semtCode, that.semtCode) &&
                Objects.equal(mahalle, that.mahalle) &&
                Objects.equal(detay, that.detay) &&
                Objects.equal(telefon, that.telefon) &&
                Objects.equal(postaCode, that.postaCode) &&
                Objects.equal(active, that.active) &&
                Objects.equal(def, that.def) &&
                Objects.equal(addDate, that.addDate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, userId, ilCode, ilceCode, semtCode, mahalle, detay, telefon, postaCode, active, def, addDate);
    }



}
