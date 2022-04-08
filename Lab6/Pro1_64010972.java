import java.util.Scanner;

public class Pro1_64010972 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        System.out.print("Enter weight in pound: ");
        double weight = scan.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = scan.nextDouble();
        System.out.println(new BMI(name, age, weight, 0, inches));
    }
}

class BMI {
    String name;
    int age;
    double weightKg;
    double heightM;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        weightKg = weight * 0.45359237;
        heightM = (feet * 12 + inches) * 0.0254;
    }

    public double getIndex() {
        return weightKg / heightM / heightM;
    }

    public String getInterpretation() {
        double bmi = getIndex();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (18.5 <= bmi && bmi < 25) {
            return "Normal";
        } else if (25 <= bmi && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    @Override
    public String toString() {
        return getIndex() + " (" + getInterpretation() + ")";
    }
}