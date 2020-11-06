package oop_homework2;

public interface IPhoneOperations {
    void addContact(int id, String phoneNumber, String firstName, String lastName);

    void listContacts();

    void sendMessage(String phoneNumber, String messageContent);
}
