package oop_homework2;

public class Phone extends AMorePhoneOperations implements IPhoneOperations{

    public String name;

    public String color;

    public String material;

    int id;

    String phoneNumber;

    String firstName;

    String lastName;

    String messageContent;

    public Phone() {

    }

    public Phone(String name) {
        this.name = name;
    }

    public void listMessages() {
        //see all messages from a contact

    }

    public void call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println(phoneNumber + " is calling");

    }

    public void viewHistory() {

    }

    public void addContact(int id, String phoneNumber, String firstName, String lastName){
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
    }



}
