import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        boolean stopIt = false;
        int major = 0;

        while (!stopIt) {
            int num = scanner.nextInt();
            major = Math.max(major, num);
            if (num == 0) {
                stopIt = true;
            }
        }
        System.out.println(major);
    }
}