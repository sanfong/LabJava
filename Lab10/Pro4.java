import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        double totalAssist = 0, totalAsso = 0, totalfull = 0;
        int assistCount = 0, assoCount = 0, fullCount = 0;
        try (Scanner scanSalary = new Scanner(new File("Salary.txt"))) {
            while (scanSalary.hasNextLine()) {
                String[] data = scanSalary.nextLine().split(" ");
                if (data[2].equals("assistant")) {
                    assistCount++;
                    totalAssist += Double.parseDouble(data[3]);
                } else if (data[2].equals("associate")) {
                    assoCount++;
                    totalAsso += Double.parseDouble(data[3]);
                } else if (data[2].equals("full")) {
                    fullCount++;
                    totalfull += Double.parseDouble(data[3]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Where is file?");
            return;
        }
        double totalSum = totalAssist + totalAsso + totalfull;
        int totalCount = assistCount + assoCount + fullCount;
        System.out.printf("Total salary for assistant professor is %,.2f\n", totalAssist);
        System.out.printf("Total salary for associate professor is %,.2f\n", totalAsso);
        System.out.printf("Total salary for full professor is %,.2f\n", totalfull);
        System.out.printf("Total salary for all professors is %,.2f\n", totalSum);
        System.out.printf("Average salary for assistant professor is %,.2f\n", (totalAssist / assistCount));
        System.out.printf("Average salary for associate professor is %,.2f\n", (totalAsso / assoCount));
        System.out.printf("Average salary for full professor is %,.2f\n", (totalfull / fullCount));
        System.out.printf("Average salary for all professors is %,.2f\n", (totalSum / totalCount));
    }
}
