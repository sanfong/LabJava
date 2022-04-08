import java.util.Date;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected Date dateHired = new Date();

    public Employee() {
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
    }

    protected String getEmployeeData() {
        return String.format("Employee{office=%s, salary=%.2f, dateHired=%s}", office, salary, dateHired);
    }

    @Override
    public String toString() {
        return "Employee\n" +
                "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Phone: " + phoneNumber + "\n" +
                "Email: " + emailAddress + "\n" + getPersonData() + " " +
                getEmployeeData();
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return this.dateHired;
    }
}
