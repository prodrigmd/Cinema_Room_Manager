import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;

        for (;;) {
            num = scanner.nextInt();
            sum += num;
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            } else if (num == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}