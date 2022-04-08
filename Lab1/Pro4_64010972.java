import java.util.Scanner;
// 64010972 อภิญวัช ขวัญพฤกษ์
public class Pro4_64010972 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter weight in pounds: ");
        Double weight = scan.nextDouble() * 0.45359237;
        System.out.print("Enter height in inches: ");
        Double height = scan.nextDouble() * 0.0254;
        System.out.println("BMI is " + String.format("%.4f", weight / Math.pow(height, 2)));
    }
}
