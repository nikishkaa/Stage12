package by.itstep.javatask.stage12.task.task3.util;

import by.itstep.javatask.stage12.util.view.Printer;

import java.util.Scanner;

public class TicketsNumber {
    public static Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getNumberOfTickets() {

        Printer.print("Input count of digit in bus ticket number: ");

        return SCANNER.nextInt();
    }
}
