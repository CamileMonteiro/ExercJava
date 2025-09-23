public class Contact {

    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void present() {
        System.out.println("----------Your Contacts----------");
        System.out.println("Name: " +this.name);
        System.out.println("Phone: " +this.phone);
        System.out.println("----------------------");
    }   
}

