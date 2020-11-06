package oop_homework2;

public class SamsungNote9 extends Samsung{

    private final int batteryLife=20;

    int actualBatteryLife;

    private int b;

    private int m;

    public SamsungNote9(int actualBatteryLife) {
        this.actualBatteryLife = actualBatteryLife;
    }

    public int subtractActualBatteryLifeCall(){
        b = this.actualBatteryLife - 2;
        return b;
    }

    public int subtractActualBatteryLifeMessage(){
        m = this.actualBatteryLife - 1;
        return m;
    }
}
