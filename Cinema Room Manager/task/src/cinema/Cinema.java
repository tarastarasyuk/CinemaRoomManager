package cinema;

import java.util.Scanner;

public class Cinema {

    public static int ticketPrice = 0;
    public static int totalPrice = 0;
    public static int currentIncome = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        System.out.println("Enter the number of rows:");
        System.out.print("> ");
        int rows = 0;
        rows = validateNum(rows);

        System.out.println("Enter the number of seats in each row:");
        System.out.print("> ");
        int seats = 0;
        seats = validateNum(seats);

        if (rows * seats < 60) {
            totalPrice = rows * seats * 10;
        } else if (rows * seats > 60) {
            totalPrice = ((rows / 2) * seats * 10) + ((rows - (rows / 2)) * seats * 8);
        }

        String[][] cinema = new String[rows][seats];
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                cinema[i][j] = "S";
            }
        }

        boolean checker = true;
        while (checker) {
            System.out.print("\n1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "3. Statistics\n" +
                    "0. Exit\n" +
                    "> ");
            int nav = sc.nextInt();
            switch (nav) {
                case 1:
                    showTheSeat(rows, seats, cinema);
                    break;
                case 2:
                    buyTicket(rows, seats, cinema);
                    break;
                case 3:
                    showStatistics(rows, seats, cinema);
                    break;
                case 0:
                    checker = false;
                    break;
            }
        }
    }

    public static int validateNum(int number) {
        Scanner sc = new Scanner(System.in);
        boolean isNumber;
        do {
            if (sc.hasNextInt()){

                number = sc.nextInt();
                if (number <= 0 ){
                    System.out.println("Wrong input! Try again!");
                    System.out.print("> ");
                    isNumber = false;
                } else {
                    isNumber = true;
                }

            } else {
                System.out.println("Wrong input! Try again!");
                System.out.print("> ");
                isNumber = false;
                sc.next();
            }
        } while (!isNumber);
        return number;
    }



    private static void showStatistics(int rows, int seats, String[][] cinema) {
        int counter = 0;
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if (cinema[i][j].equals("B")) {
                    counter++;
                }
            }
        }
        double percentage = ((float)counter * 100) / (rows * seats);
        System.out.printf("Number of purchased tickets: %d\n",counter);
        System.out.printf("Percentage: %.2f",percentage);
        System.out.println("%");
        System.out.printf("Current income: $%d\n",currentIncome);
        System.out.printf("Total income: $%d\n",totalPrice);
    }

    private static void buyTicket(int rows, int seats, String[][] cinema) {
        int tenPrice = 10;
        int eightPrice = 8;
        Scanner sc = new Scanner(System.in);
        int wantedRow = 0;
        int wantedSeat = 0;

        System.out.println("Enter a row number:");
        System.out.print("> ");
        wantedRow = validateNum(wantedRow);
        System.out.println("Enter a seat number in that row:");
        System.out.print("> ");
        wantedSeat = validateNum(wantedSeat);



        if (wantedRow <= rows && wantedSeat <= seats) {

            if (cinema[wantedRow - 1][wantedSeat - 1].equals("S")) {

                if (rows * seats < 60) {
                    ticketPrice = tenPrice;
                } else if (rows * seats > 60) {
                    if (wantedRow <= rows / 2) {
                        ticketPrice = tenPrice;
                    } else if (wantedRow > rows / 2)
                        ticketPrice = eightPrice;
                }
                cinema[wantedRow - 1][wantedSeat - 1] = "B";

                currentIncome += ticketPrice;
                System.out.println("Ticket price: $" + ticketPrice);
            } else {
                System.out.println("That ticket has already been purchased!");
                buyTicket(rows, seats, cinema);
            }


        } else {
            System.out.println("Wrong input!");
        }
    }

    private static void showTheSeat(int rows, int seats, String[][] cinema) {

        System.out.println("\nCinema:");
        for (int i = 0; i <= seats; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else
                System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 0; i < cinema.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }
}
