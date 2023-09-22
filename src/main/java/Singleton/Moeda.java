package Singleton;

public class Moeda {
    private Moeda() {};
    private static Moeda instance = new Moeda();
    public static Moeda getInstance() {
        return instance;
    }

    private float BRL;
    private float USD;

    public float getBRL() {
        return BRL;
    }

    public void setBRL(float BRL) {
        this.BRL = BRL;
    }

    public float getUSD() {
        return USD;
    }

    public void setUSD(float USD) {
        this.USD = USD;
    }
}
