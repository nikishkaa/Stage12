package by.itstep.javatask.stage12.task.task2.util;

import by.itstep.javatask.stage12.util.view.Printer;

import java.util.Scanner;

public class NumberInit {
    public static Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getCountOfDigit() {
        Printer.print("Input count of digit[3-5]:");

        return SCANNER.nextInt();
    }
}
