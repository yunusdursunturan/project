package com.test.model.request;

import com.test.model.object.Telephone;

import java.util.Date;

/**
 * Created by yturan on 06/08/15.
 */
public class UserRequest {
    private Integer userId;
    private String userName;
    private String surName;
    private String email;
    private String cinsiyet;
    private Telephone telephone;
    private String address;
    private Boolean active;
    private String medeniHali;
    private Date dogumTarihi;
    private String meslek;
    private String sehir;
    private String pass;
    private Integer postCode;

    public UserRequest() {
    }

    public UserRequest(Integer postCode, String pass, String sehir, String meslek, Date dogumTarihi, String medeniHali, Boolean active, String address,
                       Telephone telephone, String cinsiyet, String email, String surName, String userName, Integer userId) {
        this.postCode = postCode;
        this.pass = pass;
        this.sehir = sehir;
        this.meslek = meslek;
        this.dogumTarihi = dogumTarihi;
        this.medeniHali = medeniHali;
        this.active = active;
        this.address = address;
        this.telephone = telephone;
        this.cinsiyet = cinsiyet;
        this.email = email;
        this.surName = surName;
        this.userName = userName;
        this.userId = userId;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getMedeniHali() {
        return medeniHali;
    }

    public void setMedeniHali(String medeniHali) {
        this.medeniHali = medeniHali;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", telephone=" + telephone +
                ", address='" + address + '\'' +
                ", active=" + active +
                ", medeniHali='" + medeniHali + '\'' +
                ", dogumTarihi=" + dogumTarihi +
                ", meslek='" + meslek + '\'' +
                ", sehir='" + sehir + '\'' +
                ", pass='" + pass + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
