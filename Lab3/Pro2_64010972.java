import java.util.Arrays;
import java.util.Scanner;

public class Pro2_64010972 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] list1 = getIntList("Enter list1: ");
        int[] list2 = getIntList("Enter list2: ");
        int[] list3 = merge(list1, list2);
        System.out.print("The merged list is ");
        for (int i : list3) {
            System.out.print(i + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] list3 = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, list3, 0, list1.length);
        System.arraycopy(list2, 0, list3, list1.length, list2.length);
        Arrays.sort(list3);
        return list3;
    }

    static int[] getIntList(String prompt) {
        System.out.print(prompt);
        String[] strList = scan.nextLine().split(" ");
        int[] numList = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            numList[i] = Integer.parseInt(strList[i]);
        }
        return numList;
    }
}
