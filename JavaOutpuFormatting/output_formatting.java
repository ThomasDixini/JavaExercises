package JavaOutpuFormatting;

import java.util.Scanner;

public class output_formatting {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();
        String inputThree = scanner.nextLine();
        scanner.close();

        String array1[] = inputOne.split(" ");
        String array2[] = inputTwo.split(" ");
        String array3[] = inputThree.split(" ");

        System.out.printf("=======================\n");
        System.out.printf("%s               %d\n", array1[0], array1[1].toString());
        System.out.printf("%s               %d\n", array2[0], array2[1].toString());
        System.out.printf("%s               %d\n", array3[0], array3[1].toString());
        System.out.printf("======================="); 
    }
}
