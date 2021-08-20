import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] incomes = new int[n];

        for (int i = 0; i < n; i++) {
            incomes[i] = scanner.nextInt();
        }

        double[] percentTaxes = new double[n];
        double taxes = 0;
        int company = 0;

        for (int i = 0; i < n; i++) {
            percentTaxes[i] = scanner.nextDouble() / 100;
            double taxes1 = incomes[i] * percentTaxes[i];
            if (taxes1 > taxes) {
                taxes = taxes1;
                company = i + 1;
            }
        }
        System.out.println(company);
    }
}