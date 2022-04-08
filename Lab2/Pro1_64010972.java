import java.util.Scanner;

// 64010972 อภิญวัช ขวัญพฤกษ์
public class Pro1_64010972 {
    static Scanner scan = new Scanner(System.in);
    static String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static void main(String[] args) {
        System.out.print("Enter today's day: ");
        int today = scan.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int nextday = scan.nextInt();
        System.out.println("Today is " + days[today] + " and the future day is " + days[today + (nextday % 7)]);
    }
}