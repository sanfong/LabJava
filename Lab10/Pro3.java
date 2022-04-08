import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Pro3 { 
    static Random rand = new Random();
    static String[] ranks = {" assistant ", " associate ", " full "};

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Salary.txt")) {
            for (int i = 1; i < 1001; i++) {
                int r = rand.nextInt(3);
                writer.write("FirstName" + i + " LastName" + i + ranks[r] + randomSalary(r) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static double randomSalary(int rank) {
        double[] origin = {50000, 60000, 75000};
        double[] bound = {80000, 110000, 130000};
        return ((int)(rand.nextDouble(origin[rank], bound[rank]) * 100)) / 100.0;
    }
}