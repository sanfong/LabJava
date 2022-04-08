public class Staff extends Employee {
    private String title;

    public Staff() {
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff\n" +
                "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Phone: " + phoneNumber + "\n" +
                "Email: " + emailAddress + "\n" + getPersonData() + " " +
                getEmployeeData() + " " +
                String.format("Staff{title=%s}", title);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
