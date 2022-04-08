import java.util.Scanner;

public class Pro3_64010972 {
    static Scanner scan = new Scanner(System.in);
    static int[][] matrix;
    static String[] outputs = { "All 0s", "All 1s", "No same numbers" };

    public static void main(String[] args) throws Exception {
        System.out.print("Enter the size for the matrix: ");
        int d = scan.nextInt();
        matrix = new int[d][d];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        checkRow();
        checkColumn();
        checkSuperDiagonal();
        checkDiagonal();
        checkSubDiagonal();
    }

    static void checkRow() {
        boolean noSame = true;
        for (int row = 0; row < matrix.length; row++) {
            for (int check = 0; check < 2; check++) {
                if (rowAllSame(row, check)) {
                    noSame = false;
                    System.out.println(outputs[check] + " on row " + row);
                }
            }
        }
        if (noSame) {
            System.out.println(outputs[2] + " on a row");
        }
    }

    static boolean rowAllSame(int row, int check) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[row][i] != check) {
                return false;
            }
        }
        return true;
    }

    static void checkColumn() {
        boolean noSame = true;
        for (int col = 0; col < matrix.length; col++) {
            for (int check = 0; check < 2; check++) {
                if (colAllSame(col, check)) {
                    noSame = false;
                    System.out.println(outputs[check] + " on column " + col);
                }
            }
        }
        if (noSame) {
            System.out.println(outputs[2] + " on a column");
        }
    }

    static boolean colAllSame(int col, int check) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != check) {
                return false;
            }
        }
        return true;
    }

    static void checkSuperDiagonal() {
        boolean noSame = true;
        for (int check = 0; check < 2; check++) {
            if (diaAllSame(matrix.length - 1, 0, 1, check)) {
                noSame = false;
                System.out.println(outputs[check] + " on the superdiagonal");
            }
        }
        if (noSame) {
            System.out.println(outputs[2] + " on the superdiagonal");
        }
    }

    static void checkDiagonal() {
        boolean noSame = true;
        for (int check = 0; check < 2; check++) {
            if (diaAllSame(matrix.length, 0, 0, check)) {
                noSame = false;
                System.out.println(outputs[check] + " on the diagonal");
            }
        }
        if (noSame) {
            System.out.println(outputs[2] + " on the diagonal");
        }
    }

    static void checkSubDiagonal() {
        boolean noSame = true;
        for (int check = 0; check < 2; check++) {
            if (diaAllSame(matrix.length - 1, 1, 0, check)) {
                noSame = false;
                System.out.println(outputs[check] + " on the subdiagonal");
            }
        }
        if (noSame) {
            System.out.println(outputs[2] + " on the subdiagonal");
        }
    }

    static boolean diaAllSame(int len, int startRow, int startCol, int check) {
        for (int i = 0; i < len; i++) {
            if (matrix[startRow + i][startCol + i] != check) {
                return false;
            }
        }
        return len >= 1;
    }
}
