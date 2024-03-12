package Simple_Input;
import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        scanner.close();

        System.out.println(String.format("%d \n%d \n%d", first, second, third));
    }
}