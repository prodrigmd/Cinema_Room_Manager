import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String[] list = scanner.nextLine().split(" ");
        int rotation = scanner.nextInt();
        int change = rotation % list.length;
        String[] list2 = new String[list.length];

        for (int i = 0; i < list.length - change; i++) {
            list2[i + change] = list[i];
        }

        for (int j = 0, m = change; j < change % list.length; j++, m--) {
            list2[j] = list[list.length - m];
        }

        for (String str : list2) {
            System.out.print(str + " ");
        }
    }
}