import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        
        Scanner scanner = new Scanner(System.in);
        int qtdNumbers = scanner.nextInt();

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < qtdNumbers; i++) {
            Scanner scanner2 = new Scanner(System.in);
            String name = scanner2.nextLine();

            Scanner scanner3 = new Scanner(System.in);
            int phoneNumber = scanner3.nextInt();

            map.put(name, phoneNumber);
        }

        for (Map.Entry<String, Integer> item : map.entrySet()) {
            Scanner scanner4 = new Scanner(System.in);
            String query = scanner4.nextLine();

            boolean found = map.containsKey(query);

            if (!found) {
                System.out.println("Not found");
            } else {
                System.out.println(item);
            }
        }
    }
}