package by.itstep.javatask.stage12.task.task2.controller;

import by.itstep.javatask.stage12.task.task2.model.ArmstrongLogic;
import by.itstep.javatask.stage12.task.task2.util.ArmstrongUI;
import by.itstep.javatask.stage12.util.numberinitializer.Number;
import by.itstep.javatask.stage12.util.view.Printer;


public class Main {
    public static void main(String[] args) {
        int number = Number.getInitializeNumber();

        int[] armstrongNumbers = ArmstrongLogic.getArmstrongNumber(number);

        Printer.print(ArmstrongUI.getArmstrongUI(armstrongNumbers));
    }
}
