package test.model.request;

import test.model.object.Ilce;
import test.model.object.Sehir;
import test.model.object.Semt;
import test.model.object.Telephone;

import java.util.Date;

/**
 * Created by yturan on 06/08/15.
 */
public class AddressRequest {
    private Integer addresId;
    private Integer userId;
    private Ilce ilce;
    private Sehir sehir;
    private Semt semt;
    private String mah;
    private String detay;
    private Telephone tel;
    private Integer postCode;
    private Boolean active;
    private Date addDate;
    private Boolean def;

    public AddressRequest() {
    }

    public AddressRequest(Integer addresId, Integer userId, Ilce ilce, Sehir sehir, Semt semt, String mah, String detay, Telephone tel, Integer postCode, Boolean active, Date addDate, Boolean def) {
        this.addresId = addresId;
        this.userId = userId;
        this.ilce = ilce;
        this.sehir = sehir;
        this.semt = semt;
        this.mah = mah;
        this.detay = detay;
        this.tel = tel;
        this.postCode = postCode;
        this.active = active;
        this.addDate = addDate;
        this.def = def;
    }

    public Boolean getDef() {
        return def;
    }

    public void setDef(Boolean def) {
        this.def = def;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public Telephone getTel() {
        return tel;
    }

    public void setTel(Telephone tel) {
        this.tel = tel;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }

    public String getMah() {
        return mah;
    }

    public void setMah(String mah) {
        this.mah = mah;
    }

    public Semt getSemt() {
        return semt;
    }

    public void setSemt(Semt semt) {
        this.semt = semt;
    }

    public Sehir getSehir() {
        return sehir;
    }

    public void setSehir(Sehir sehir) {
        this.sehir = sehir;
    }

    public Ilce getIlce() {
        return ilce;
    }

    public void setIlce(Ilce ilce) {
        this.ilce = ilce;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddresId() {
        return addresId;
    }

    public void setAddresId(Integer addresId) {
        this.addresId = addresId;
    }

    @Override
    public String toString() {
        return "AddressRequest{" +
                "addresId=" + addresId +
                ", userId=" + userId +
                ", ilce=" + ilce +
                ", sehir=" + sehir +
                ", semt=" + semt +
                ", mah='" + mah + '\'' +
                ", detay='" + detay + '\'' +
                ", tel=" + tel +
                ", postCode=" + postCode +
                ", active=" + active +
                ", addDate=" + addDate +
                ", def=" + def +
                '}';
    }
}
