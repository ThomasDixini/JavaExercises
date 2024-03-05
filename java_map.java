import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int qtdNumbers = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        String name = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        int phoneNumber = scanner3.nextInt();

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(name, phoneNumber);

        System.out.println(map);
    }
}