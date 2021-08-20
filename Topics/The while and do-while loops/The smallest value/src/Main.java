import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        long i = 0L;
        long j = 1L;

        while (j <= m) {
            i++;
            j *= i;
        }
        System.out.println(i);
    }
}