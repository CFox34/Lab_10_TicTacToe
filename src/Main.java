import java.util.Scanner;

public class Main {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String result = " ";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            result = pipe.nextLine();
            if (result.length() >= 1)
                done = true;
            else
                System.out.println("\nYou must enter at least one character!\nTry again.");

        } while (!done);
        return result;

    }
}