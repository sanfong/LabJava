public class Pro1_64010972 {
    public static void main(String[] args) {
        for (int n = 2, count = 0; count < 1000; n++) {
            if (isPalin(n) && isPrime(n)) {
                count++;
                System.out.print(n + ((count % 10 > 0) ? " " : "\n"));
            }
        }
    }

    static Boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {  
                return false;
            }
        }  
        return true;
    }

    static Boolean isPalin(int n) {
        int temp = n;
        int palin = 0;
        while (temp > 0) {
            palin *= 10;
            palin += temp % 10;
            temp /= 10;
        }
        return n == palin;
    }
}