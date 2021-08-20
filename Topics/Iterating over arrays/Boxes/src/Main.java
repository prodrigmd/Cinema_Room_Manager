import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] box1 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        Arrays.sort(box1);
        int[] box2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        Arrays.sort(box2);

        int sides3 = 0;

        for (int i = 0; i < 3; i++) {
            if (box1[i] < box2[i]) {
                sides3--;
            } else if (box1[i] > box2[i]) {
                sides3++;
            }
        }
        if (sides3 == -3) {
            System.out.println("Box 1 < Box 2");
        } else if (sides3 == 3) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}