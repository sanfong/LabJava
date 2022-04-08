public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    protected String getPersonData() {
        return String.format("Person{name=%s, address=%s, phoneNumber=%s, email=%s}", name, address, phoneNumber, emailAddress);
    }

    @Override
    public String toString() {
        return "Person\n" +
                "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Phone: " + phoneNumber + "\n" +
                "Email: " + emailAddress + "\n" + getPersonData();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}