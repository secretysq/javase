package struct;

import java.util.Scanner;

public class IFdemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入内容：");
        String s = scanner.nextLine();

        //equals  判断字符串是否相等
        if (s.equals("hello")){
            System.out.println(s);
        }
        System.out.println("End");


        scanner.close();
    }
}
