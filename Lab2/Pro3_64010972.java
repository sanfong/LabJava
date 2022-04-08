import java.util.Scanner;

// 64010972 อภิญวัช ขวัญพฤกษ์
public class Pro3_64010972 {
    static Scanner scan = new Scanner(System.in);
    static String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

    public static void main(String[] args) {
        System.out.print("Enter year: ");
        int y = scan.nextInt();
        System.out.print("Enter month: ");
        int m = scan.nextInt();
        System.out.print("Enter day: ");
        int q = scan.nextInt();

        if (m == 1) {
            m = 13;
            y--;
        }
        else if (m == 2) {
            m = 14;
            y--;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        System.out.println(days[h]);
    }
}
