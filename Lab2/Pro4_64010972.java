import java.util.Scanner;

public class Pro4_64010972 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String[] cities = new String[3];
        System.out.print("Enter the first city: ");
        cities[0] = scan.nextLine();
        System.out.print("Enter the second city: ");
        cities[1] = scan.nextLine();
        System.out.print("Enter the third city: ");
        cities[2] = scan.nextLine();
        if (cities[1].compareTo(cities[0]) < 0 && cities[1].compareTo(cities[2]) < 0) {
            String temp = cities[0];
            cities[0] = cities[1];
            cities[1] = temp;
        } else if (cities[2].compareTo(cities[0]) < 0) {
            String temp = cities[0];
            cities[0] = cities[2];
            cities[2] = temp;
        }
        if (cities[2].compareTo(cities[1]) < 0) {
            String temp = cities[1];
            cities[1] = cities[2];
            cities[2] = temp;
        }
        System.out.println("The three cities in alphabetical order are " + cities[0] + " " + cities[1] + " " + cities[2]);
    }
}
