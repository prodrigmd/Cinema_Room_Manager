import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.print(num + " ");

        while (num != 1) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            System.out.print(num + " ");
        }
    }
}