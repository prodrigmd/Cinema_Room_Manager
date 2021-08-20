package cinema;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        String[][] matrix = new String[rows][seats];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(matrix[i], "S");
        }
        int income = 0;
        boolean stopIt = false;
        while (!stopIt) {
            options();
            int opt = scanner.nextInt();
            if (opt == 1) {
                showSeats(seats, rows, matrix);
            } else if (opt == 2) {
                income += buyTicket(rows, seats, matrix);
            } else if (opt == 3) {
                statistics(rows, seats, matrix, income);
            } else if (opt == 0) {
                stopIt = true;
            }
        }

    }
    public static void showSeats(int seats, int rows, String[][] matrix) {
        System.out.println("\nCinema:");
        System.out.print("  ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < seats; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int buyTicket(int rows, int seats, String[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        int price = 0;
        boolean stopIt = false;
        while (!stopIt) {
            System.out.println("\nEnter a row number:");
            int yourRow = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            int yourSeat = scanner.nextInt();
            if (yourRow < 1 || yourRow > matrix.length || yourSeat < 1 || yourSeat > matrix.length) {
                System.out.println("\nWrong input!");
            } else {
                if (Objects.equals(matrix[yourRow - 1][yourSeat - 1], "B")) {
                    System.out.println("\nThat ticket has already been purchased!");
                } else {
                    price = yourRow <= rows / 2 || rows * seats < 60? 10: 8;
                    System.out.println("\nTicket price: $" + price);
                    matrix[yourRow - 1][yourSeat - 1] = "B";
                    stopIt = true;
                }
            }

        }
        return price;
    }
    public static void options() {
        System.out.println("\n1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }
    public static void statistics(int rows, int seats, String[][] matrix, int income) {

        int purchased = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                if (Objects.equals(matrix[i][j], "B")) {
                    purchased++;
                }
            }
        }
        float percentage = (float) purchased * 100 / (rows * seats);

        int total = 0;
        if (rows * seats < 60) {
            total = rows * seats * 10;
        } else {
            if (rows % 2 == 0) {
                total = rows * seats * 9;
            } else {
                total = (rows / 2) * seats * 10 + (rows / 2 + 1) * seats * 8;
            }
        }

        System.out.printf("\nNumber of purchased tickets: %d%n", purchased);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.printf("Current income: $%d%n", income);
        System.out.printf("Total income: $%d%n", total);
    }
}