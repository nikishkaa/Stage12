package by.itstep.javatask.stage12.task.task1.model.numberlogic;

public class ReverseNumber {
    public static int getReverseNumber(int number) {

        number = number > 0 ? number : -number;

        int reverseNumber = 0;

        int count = -1;

        while (count <= number) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
            count++;
        }

        return reverseNumber;
    }
}
