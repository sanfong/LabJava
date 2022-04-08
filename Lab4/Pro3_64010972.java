public class Pro3_64010972 {
    public static void main(String[] args) {
        System.out.println("Creating a list containing 1000 elements,");
        double[] dar = new double[1000];
        for (int i = 0; i < dar.length; i++) {
            dar[i] = Math.random() * 1000;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%10.2f" + (((i + 1) % 5 == 0) ? "\n" : ""), dar[i]);
        }
        System.out.printf("%10s\n", "...   ");
        for (int i = 990; i < 1000; i++) {
            System.out.printf("%10.2f" + (((i + 1) % 5 == 0) ? "\n" : ""), dar[i]);
        }

        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        StopWatch stopWatch = new StopWatch();
        selectionSort(dar);
        stopWatch.stop();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%10.2f" + (((i + 1) % 5 == 0) ? "\n" : ""), dar[i]);
        }
        System.out.printf("%10s\n", "... ");
        for (int i = 995; i < 1000; i++) {
            System.out.printf("%10.2f" + (((i + 1) % 5 == 0) ? "\n" : ""), dar[i]);
        }

        System.out.println("Sorting stopwatch stoped.");
        System.out.printf("The sort time is %.1f milliseconds.\n", stopWatch.getElapsedTime());
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        stopWatch.start();
        for (int n = 2, count = 0; count < 1000; n++) {
            if (isPalin(n) && isPrime(n)) {
                System.out.print(n + ((++count % 10 > 0) ? " " : "\n"));
            }
        }
        stopWatch.stop();
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.printf("The palindromPrime time is %.1f milliseconds.\n", stopWatch.getElapsedTime());
    }

    static Boolean isPrime(int n) {
        if (n <= 1 || n % 2 == 0) {
            return n == 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
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

    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            double smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}

class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.nanoTime();
    }

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public double getElapsedTime() {
        return (endTime - startTime) / 1000000.0;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}