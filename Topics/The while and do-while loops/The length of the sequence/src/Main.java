import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean stopIt = false;
        int count = 0;
        do {
            int num = scanner.nextInt();
            if (num != 0) {
                count++;
            } else {
                stopIt = true;
            }
        } while (!stopIt);
        System.out.println(count);
    }
}