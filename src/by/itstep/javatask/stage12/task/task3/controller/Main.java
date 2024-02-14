package by.itstep.javatask.stage12.task.task3.controller;

import by.itstep.javatask.stage12.task.task3.model.logic.TicketLogic;
import by.itstep.javatask.stage12.task.task3.util.TicketsNumber;

public class Main {
    public static void main(String[] args) {

        int countOfDigit = TicketsNumber.getNumberOfTickets();

        int countOfHappyTickets = TicketLogic.getCountAllHappyTickets(countOfDigit);


        System.out.println(countOfHappyTickets);

    }
}
