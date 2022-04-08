public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty\n" +
                "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Phone: " + phoneNumber + "\n" +
                "Email: " + emailAddress + "\n" + getPersonData() + " " +
                getEmployeeData() + " " +
                String.format("Faculty{officeHours=%s, rank=%s}", officeHours, rank);
    }

    public String getOfficeHours() {
        return this.officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}
