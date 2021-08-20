import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int perfect = 0; // 0
        int larger = 0; // 1
        int smaller = 0; // -1

        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            if (size == 0) {
                perfect++;
            } else if (size == 1) {
                larger++;
            } else if (size == -1) {
                smaller++;
            }
        }

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}