import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double i = 0;
        double sum = 0;

        while (a <= b) {
            if (a % 3 == 0) {
                sum += a;
                i++;
            }
            a++;
        }
        double prom = sum / i;

        System.out.println(prom);
    }
}