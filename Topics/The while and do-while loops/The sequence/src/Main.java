import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 0;
        int majorFour = 0;

        while (i < n) {
            int number = scanner.nextInt();

            if (number % 4 == 0) {
                majorFour = Math.max(number, majorFour);
            }
            i++;
        }
        System.out.println(majorFour);
    }
}