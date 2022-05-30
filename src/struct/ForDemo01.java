package struct;

public class ForDemo01 {
    public static void main(String[] args) {

        int a=1;

        while (a<=100){
            System.out.println(a);
            a+=2;
        }
        System.out.println("while结束");

        for (int i=1;i<=100;i+=2){
            System.out.println(i);
        }
        System.out.println("for结束");

       //快捷输入  111.for
        for (int i = 0; i < 111; i++) {

        }

    }


}
