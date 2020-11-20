package oop_homework2;

import java.util.ArrayList;
import java.util.List;

public class PhoneMain {


    public static void main(String... args) {

        SamsungGalaxyS9 phone1 = new SamsungGalaxyS9(18);
        SamsungNote9 phone2 = new SamsungNote9(20);
        Phone phone3 = new HuaweiMate20();
        Phone phone4 = new HuaweiP40();

        phone1.addContact(1, "075432490", "Mary", "Olsen");
        phone2.addContact(2, "075532456", "John", "Smith");


        phone1.call("075432490");
        System.out.println("Actual battery life " + phone1.subtractActualBatteryLifeCall());

        Call call1 = new Call("075432490");

        phone2.call("0768900302");

        Call call2 = new Call("0768900302");

        List<Call> calls = new ArrayList<>();
        calls.add(call1);
        calls.add(call2);


        for (int i = 0; i < calls.size(); i++) {
            System.out.println(calls.get(i));
        }


        phone2.sendMessage("075532456", "Hello Mary! This is John. How are you?");
        System.out.println("Actual battery life " + phone2.subtractActualBatteryLifeMessage());

    }


}
