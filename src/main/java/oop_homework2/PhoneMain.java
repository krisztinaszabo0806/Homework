package oop_homework2;

import java.util.ArrayList;
import java.util.List;

public class PhoneMain {


    public static void main(String... args) {

        SamsungGalaxyS9 phone1 = new SamsungGalaxyS9(18);
        SamsungNote9 phone2 = new SamsungNote9(20);
        Phone phone3 = new HuaweiMate20();
        Phone phone4 = new HuaweiP40();

        phone1.addContact(1,"075432490", "Mary", "Olsen");
        phone2.addContact(2, "075532456", "John", "Smith");


        phone1.call("075432490");

        Call call1 = new Call("075432490");

        phone1.call("Unknown");

        Call call2 = new Call("Unknown");

        List<Call> calls = new ArrayList<>();
        calls.add(call1);
        calls.add(call2);


        for(int i=0;i<calls.size();i++){
            System.out.println(calls.get(i));
        }


        phone1.subtractActualBatteryLifeCall();
        System.out.println("Actual battery life " + phone1.subtractActualBatteryLifeCall());

        phone2.sendMessage("075532456", "Hello Mary! This is John. How are you?");
        phone2.subtractActualBatteryLifeMessage();
        System.out.println("Actual battery life " + phone2.subtractActualBatteryLifeMessage());



    }


}
