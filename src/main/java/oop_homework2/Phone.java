package oop_homework2;

public class Phone extends AMorePhoneOperations implements IPhoneOperations {

    public String name;

    public String color;

    public String material;

    int id;

    String phoneNumber;

    String firstName;

    String lastName;

    String messageContent;

    public int batteryLife;

    private int batteryLifeCall;

    private int batteryLifeMessage;

    public Phone() {

    }

    public Phone(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void listMessages() {
        //see all messages from a contact

    }

    public void call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println("Calling: " + phoneNumber);
        this.subtractActualBatteryLifeCall();

    }

    public int subtractActualBatteryLifeCall() {
        batteryLifeCall = this.batteryLife - 2;
        return batteryLifeCall;
    }

    public void viewHistory() {
    }

      public void addContact(int id, String phoneNumber, String firstName, String lastName) {
            this.id = id;
            this.phoneNumber = phoneNumber;
            this.firstName = firstName;
            this.lastName = lastName;

        }

    public void listContacts() {

    }

    public void sendMessage(String phoneNumber, String messageContent) {
        this.phoneNumber = phoneNumber;
        this.messageContent = messageContent;
        System.out.println("Message from " + phoneNumber + ": " + messageContent);
        this.subtractActualBatteryLifeMessage();
    }

    public int subtractActualBatteryLifeMessage() {
        batteryLifeMessage = this.batteryLife - 1;
        return batteryLifeMessage;
    }


}
