package test.model.object;

/**
 * Created by yturan on 06/08/15.
 */
public class Sehir {
    private Integer ilCode;
    private String ilName;

    public Sehir() {
    }

    public Sehir(Integer ilCode, String ilName) {
        this.ilCode = ilCode;
        this.ilName = ilName;
    }

    public Integer getIlCode() {
        return ilCode;
    }

    public void setIlCode(Integer ilCode) {
        this.ilCode = ilCode;
    }

    public String getIlName() {
        return ilName;
    }

    public void setIlName(String ilName) {
        this.ilName = ilName;
    }

    @Override
    public String toString() {
        return "Sehir{" +
                "ilCode=" + ilCode +
                ", ilName='" + ilName + '\'' +
                '}';
    }
}
