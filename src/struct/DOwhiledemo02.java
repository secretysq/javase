package struct;

public class DOwhiledemo02 {
    public static void main(String[] args) {
        int a = 0;
         while (a<0){
             System.out.println(a);
             a++;
         }
        System.out.println("---------");
         do {
             System.out.println(a);
             a++;
         }while (a<0);
    }
}
//do while 至少执行一次，do while 先执行后判断，while 先判断后执行
