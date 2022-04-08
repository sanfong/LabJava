import java.util.Scanner;
// 64010972 อภิญวัช ขวัญพฤกษ์
public class Pro5_64010972 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat((n - i - 1) * 2));

            for (int j = i; j >= -i; j--) {
                System.out.print((Math.abs(j) + 1) + " ");
            }

            System.out.println();
        }
    }
}
