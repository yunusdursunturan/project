package test.model.object;

/**
 * Created by yturan on 06/08/15.
 */
public class Ilce {

    private Integer ilceCode;
    private Integer ilCode;
    private String ilceName;

    public Ilce() {
    }


    public Ilce(Integer ilceCode, Integer ilCode, String ilceName) {
        this.ilceCode = ilceCode;
        this.ilCode = ilCode;
        this.ilceName = ilceName;
    }

    public Integer getIlceCode() {
        return ilceCode;
    }

    public void setIlceCode(Integer ilceCode) {
        this.ilceCode = ilceCode;
    }

    public Integer getIlCode() {
        return ilCode;
    }

    public void setIlCode(Integer ilCode) {
        this.ilCode = ilCode;
    }

    public String getIlceName() {
        return ilceName;
    }

    public void setIlceName(String ilceName) {
        this.ilceName = ilceName;
    }

    @Override
    public String toString() {
        return "Ilce{" +
                "ilceCode=" + ilceCode +
                ", ilCode=" + ilCode +
                ", ilceName='" + ilceName + '\'' +
                '}';
    }
}
