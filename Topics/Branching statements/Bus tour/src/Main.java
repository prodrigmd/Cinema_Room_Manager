import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int bridges = scanner.nextInt();
        int detail;

        for (int i = 1; i <= bridges; i++) {
            detail = scanner.nextInt();
            if (height >= detail) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (i == bridges) {
                System.out.println("Will not crash");
            }
        }
    }
}