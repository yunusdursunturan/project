package com.test.model.object;

/**
 * Created by yturan on 06/08/15.
 */
public class Semt {
    private Integer semtCode;
    private Integer ilceCode;
    private String semtName;
    private Integer ilCode;

    public Semt() {
    }

    public Semt(Integer semtCode, Integer ilceCode, String semtName, Integer ilCode) {
        this.semtCode = semtCode;
        this.ilceCode = ilceCode;
        this.semtName = semtName;
        this.ilCode = ilCode;
    }

    public Integer getSemtCode() {
        return semtCode;
    }

    public void setSemtCode(Integer semtCode) {
        this.semtCode = semtCode;
    }

    public Integer getIlceCode() {
        return ilceCode;
    }

    public void setIlceCode(Integer ilceCode) {
        this.ilceCode = ilceCode;
    }

    public String getSemtName() {
        return semtName;
    }

    public void setSemtName(String semtName) {
        this.semtName = semtName;
    }

    public Integer getIlCode() {
        return ilCode;
    }

    public void setIlCode(Integer ilCode) {
        this.ilCode = ilCode;
    }

    @Override
    public String toString() {
        return "Semt{" +
                "semtCode=" + semtCode +
                ", ilceCode=" + ilceCode +
                ", semtName='" + semtName + '\'' +
                ", ilCode=" + ilCode +
                '}';
    }
}
