package by.itstep.javatask.stage12.util.numberinitializer;

import by.itstep.javatask.stage12.util.view.Printer;

import java.util.Scanner;

public class Number {
    private static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getInitializeNumber() {
        Printer.print("Enter your number: ");
        return SCANNER.nextInt();
    }
}
