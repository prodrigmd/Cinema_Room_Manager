import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        float m = scanner.nextInt();
        float p = scanner.nextInt();

        int k = scanner.nextInt();

        int years = 0;

        while (m < k) {
            m = m + m * (p / 100);
            years++;
        }
        System.out.println(years);
    }
}