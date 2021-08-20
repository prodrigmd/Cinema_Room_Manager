import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        boolean asc = false;
        boolean desc = false;
        int num = scanner.nextInt();
        int lastNum = num;
        boolean ordered = false;
        int i = 0;

        for (;; i++) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (lastNum > num) {
                asc = true;
            } else if (lastNum < num) {
                desc = true;
            }
            lastNum = num;
        }
        if (asc ^ desc) {
            ordered = true;
        } else if (i == 0) {
            ordered = true;
        }
        System.out.println(ordered);
    }
}