package stdin_stdout_II;

import java.util.Scanner;

public class stdin_stdout_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = scanner.nextInt();
        double double_ = scanner.nextDouble();
        scanner.nextLine();
        
        String text = scanner.nextLine();

        scanner.close();

        System.out.println("String: " + text + "\n" + "Double: " + double_ + "\n" + "Int: " + integer);

    }
}
