import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(" ");
        int count = 0;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i + 1].compareTo(list[i]) >= 0) {
                count++;
            }
        }
        if (count == list.length - 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}