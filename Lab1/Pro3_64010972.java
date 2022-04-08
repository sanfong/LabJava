import java.util.Scanner;
// 64010972 อภิญวัช ขวัญพฤกษ์
public class Pro3_64010972 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        String numStr = scan.nextLine();
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            sum += Integer.parseInt(numStr.substring(i, i + 1));
        }
        System.out.println("The sum of the digits is " + sum);
    }
}
