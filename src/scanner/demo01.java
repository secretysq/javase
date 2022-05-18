package scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {

        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("next:");

        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println("content:"+str);
        }

        //凡是属于IO流的类如果不关闭会一直占用资源，养成习惯用完关闭
        scanner.close();
    }

}
