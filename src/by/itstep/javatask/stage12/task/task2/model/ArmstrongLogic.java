package by.itstep.javatask.stage12.task.task2.model;

public class ArmstrongLogic {
    public static final int MIN_ARMSTRONG = 3;

    public static final int MAX_ARMSTRONG = 5;

    public static int[] getArmstrongNumber(int number) {

        if (number < MIN_ARMSTRONG || number > MAX_ARMSTRONG) {
            return new int[]{};
        }

        int count = 0;
        int maxNumber = (int) Math.pow(10, number) - 1;


        int[] armstrongNumbers = new int[maxNumber + 1];


        for (int i = 1; i <= maxNumber; i++) {
            if (isArmstrongNumber(i, number)) {
                armstrongNumbers[count++] = i;
            }
        }


        int[] trimmedArmstrongNumbers = new int[count];
        System.arraycopy(armstrongNumbers, 0, trimmedArmstrongNumbers, 0, count);

        return trimmedArmstrongNumbers;
    }


    private static boolean isArmstrongNumber(int number, int numDigits) {
        int sum = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }
}