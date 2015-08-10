package com.test.model.object;

/**
 * Created by yturan on 06/08/15.
 */
public class Telephone {
    private Integer alanCode;
    private Integer number;

    public Telephone() {
    }

    public Telephone(Integer alanCode, Integer number) {
        this.alanCode = alanCode;
        this.number = number;
    }

    public Integer getAlanCode() {
        return alanCode;
    }

    public void setAlanCode(Integer alanCode) {
        this.alanCode = alanCode;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                ", alanCode=" + alanCode +
                ", number=" + number +
                 '}';
    }
}
