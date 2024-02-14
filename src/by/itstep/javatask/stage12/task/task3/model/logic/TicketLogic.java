package by.itstep.javatask.stage12.task.task3.model.logic;

public class TicketLogic {
    public static int getCountAllHappyTickets(int countOfDigit) {

        countOfDigit = getValidCount(countOfDigit);


        for (int i = 0; i < countOfDigit; i++) {


        }


        return countOfDigit;
    }


    private static int getValidCount(int countOfDigit) {

        if (countOfDigit % 2 != 0) {
            return 0;
        }


        return countOfDigit > 0 ? countOfDigit : -countOfDigit;
    }

}
