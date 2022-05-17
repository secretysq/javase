package scanner;

import java.util.Scanner;

public class demo03 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("nextline:");

            String str = scanner.nextLine();

            System.out.println("line:" + str);

            scanner.close();
        }
}
