import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int numSqr = 1;
        int i = 1;

        while (numSqr <= num) {
            numSqr = i * i;
            if (numSqr <= num) {
                System.out.println(numSqr);
            }
            i++;
        }
    }
}