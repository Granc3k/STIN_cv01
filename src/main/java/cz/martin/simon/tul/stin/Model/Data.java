package cz.martin.simon.tul.stin.Model;

public class Data {
    private String s;
    private int i;
    private float f;

    public Data(String s, int i, float f) {
        this.s = s;
        this.i = i;
        this.f = f;
    }

    public String getS() {
        return s;
    }

    public int getI() {
        return i;
    }

    public float getF() {
        return f;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setF(float f) {
        this.f = f;
    }
}
