import java.util.Scanner;

public class ReadConsole {

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        String readUserInput = scanner.nextLine();
        return readUserInput;
    }

}
