import java.util.Scanner;

public class Pro1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.print("Enter index: ");
        try {
            System.out.println(arr[scan.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}