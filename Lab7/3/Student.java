public class Student extends Person {
    public static final int FRESHMAN = 0;
    public static final int SOPHOMORE = 1;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 3;
    private int status;

    public Student() {
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, int status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    private String statusStr() {
        switch (status) {
            case 0:
                return "FRESHMAN";
            case 1:
                return "SOPHOMORE";
            case 2:
                return "JUNIOR";
            case 3:
                return "SENIOR";
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "Student\n" +
                "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Phone: " + phoneNumber + "\n" +
                "Email: " + emailAddress + "\n" + getPersonData() + " " +
                String.format("Student{status=%s}", statusStr());
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}