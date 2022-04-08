public class Pro3 {
    public static void main(String[] args) {
        String name = "SF", address = "near Teenoi", phoneNumber = "0812859272", emailAddress = "64010972@kmitl.ac.th";
        Person p = new Person(name, address, phoneNumber, emailAddress);
        Student s = new Student(name, address, phoneNumber, emailAddress, Student.FRESHMAN);
        Employee e = new Employee(name, address, phoneNumber, emailAddress, "KMITL", 100000);
        Faculty f = new Faculty(name, address, phoneNumber, emailAddress, "KMITL", 100000, "24/7", "God");
        Staff a = new Staff(name, address, phoneNumber, emailAddress, "KMITL", 100000, "God");
        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(a);
    }
}
