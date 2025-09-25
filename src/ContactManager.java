
import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    private List<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<>();

    }

    public void addContact(String name, String phone) {
        Contact newContact = new Contact(name, phone);
        this.contacts.add(newContact);
        System.out.println("\nContact added successfully!!");
    }

    public void listContacts() {
        if (this.contacts.isEmpty()) {
            System.out.println("No contacts registered.");
        } else {
            System.out.println("\n----List of Contacts----");
            for (Contact contact : this.contacts) {
                contact.present();
            }
        }
    }
}
