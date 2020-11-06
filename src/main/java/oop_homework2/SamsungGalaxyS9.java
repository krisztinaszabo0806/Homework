package oop_homework2;

public class SamsungGalaxyS9 extends Samsung{

    private final int totalBatteryLife=18;

    private int actualBatteryLife = totalBatteryLife;

    private int b;

    private int m;

    public SamsungGalaxyS9(int actualBatteryLife){
        this.actualBatteryLife = actualBatteryLife;

    }

    public int getActualBatteryLife(){
        return this.actualBatteryLife;
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
