package by.itstep.javatask.stage12.task.task1.controller;

import by.itstep.javatask.stage12.task.task1.model.numberlogic.ReverseNumber;
import by.itstep.javatask.stage12.task.task1.util.ReverseUI;
import by.itstep.javatask.stage12.util.numberinitializer.Number;
import by.itstep.javatask.stage12.util.view.ConsolePrinter;

public class Main {
    public static void main(String[] args) {

        int number = Number.getInitializeNumber();

        int reverseNumber = ReverseNumber.getReverseNumber(number);


        ConsolePrinter.printed(ReverseUI.getReverseNumberUI(reverseNumber));
    }
}
