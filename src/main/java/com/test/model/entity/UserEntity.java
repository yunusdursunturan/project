package com.test.model.entity;

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
@Table(name = "user", catalog = "TestData")
public class UserEntity {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "name")
    private String userName;

    @Column(name = "lname")
    private String userLastName;

    @Column(name = "email")
    private String email;

    @Column(name = "cinsiyet")
    private String cinsiyet;

    @Column(name = "telefonId")
    private Integer telefonId;

    @Column(name = "addressId")
    private Integer addressId;

    @Column(name = "passwordId")
    private Integer passwordId;

    @Column(name = "active")
    private String active;

    @Column(name = "medeniHaliKod")
    private String medeniHaliKodu;

    @Column(name = "cepTelefon")
    private String cepTelefon;

    @Column(name = "dogumTarihi")
    private Date dogumTarihi;

    @Column(name = "meslek")
    private String meslek;

    @Column(name = "sehir")
    private String sehir;

    @Column(name = "postaKodu")
    private Integer postaKodu;

    public UserEntity() {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Integer getTelefonId() {
        return telefonId;
    }

    public void setTelefonId(Integer telefonId) {
        this.telefonId = telefonId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(Integer passwordId) {
        this.passwordId = passwordId;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getMedeniHaliKodu() {
        return medeniHaliKodu;
    }

    public void setMedeniHaliKodu(String medeniHaliKodu) {
        this.medeniHaliKodu = medeniHaliKodu;
    }

    public String getCepTelefon() {
        return cepTelefon;
    }

    public void setCepTelefon(String cepTelefon) {
        this.cepTelefon = cepTelefon;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public Integer getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(Integer postaKodu) {
        this.postaKodu = postaKodu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(userId, that.userId) &&
                Objects.equal(userName, that.userName) &&
                Objects.equal(userLastName, that.userLastName) &&
                Objects.equal(email, that.email) &&
                Objects.equal(cinsiyet, that.cinsiyet) &&
                Objects.equal(telefonId, that.telefonId) &&
                Objects.equal(addressId, that.addressId) &&
                Objects.equal(passwordId, that.passwordId) &&
                Objects.equal(active, that.active) &&
                Objects.equal(medeniHaliKodu, that.medeniHaliKodu) &&
                Objects.equal(cepTelefon, that.cepTelefon) &&
                Objects.equal(dogumTarihi, that.dogumTarihi) &&
                Objects.equal(meslek, that.meslek) &&
                Objects.equal(sehir, that.sehir) &&
                Objects.equal(postaKodu, that.postaKodu);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, userId, userName, userLastName, email, cinsiyet, telefonId, addressId, passwordId, active, medeniHaliKodu, cepTelefon, dogumTarihi, meslek, sehir, postaKodu);
    }
}
