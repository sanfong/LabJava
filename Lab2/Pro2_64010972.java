import java.util.Scanner;

// 64010972 อภิญวัช ขวัญพฤกษ์
public class Pro2_64010972 {
    static Scanner scan = new Scanner(System.in);
    static String[] rps = {"scissor", "rock", "paper"};
    static String[] results = {" too. It is a draw", ". You lost", ". You won"};
    public static void main(String[] args) {
        int comNum = (int)(Math.random() * 3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int userInput = scan.nextInt();
        System.out.println("The computer is " + rps[comNum] + ". You are " + rps[userInput] + results[(comNum - userInput + 3) % 3]);
    }
}
