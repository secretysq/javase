package struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //1.先打印第一列
        //2.把固定的1再用一个循环包起来
        //去掉重复项，i<=i
        //调整样式


        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i+"*"+j+"="+j*i+"\t");
            }
            System.out.println();

        }
    }
}
