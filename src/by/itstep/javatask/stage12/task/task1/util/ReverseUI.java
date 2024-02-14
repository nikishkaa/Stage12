package by.itstep.javatask.stage12.task.task1.util;

public class ReverseUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getReverseNumberUI(int reverseNumber) {

        return BUILDER.append("Your reversed number is: ").append(reverseNumber);
    }

}
