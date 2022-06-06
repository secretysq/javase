package struct;

public class Continuedemo {
    public static void main(String[] args) {
        int i = 0;
        while (i<100){
            i++;
            if (i%10==0){
                System.out.println();
                // break;      用于强制退出循环
                continue;       //用于终止某次循环过程
            }
            System.out.print(i);

        }
    }
}
