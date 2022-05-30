package struct;

public class ForDemo03 {
    public static void main(String[] args) {

      //练习：用while或for循环输出1-1000之间能被5整除的数，并且每行输入3个

        for (int i = 0; i < 1000; i++) {
            if (i%5==0) {
                System.out.print(i+"\t");   //print 输出会换行
            }
            if (i%(5*9)==0){
                System.out.println();       //println 不换行
            }
        }
    }


}
