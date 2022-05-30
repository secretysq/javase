package struct;

public class ForDemo02 {
    public static void main(String[] args) {

      //练习：计算0到100之间的奇数和偶数的和

        int oddsum = 0;
        int evensum = 0;

        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                oddsum+=i;
            }else {
                evensum+=i;
            }

        }
        System.out.println("奇数和:" + oddsum);
        System.out.println("偶数和:" +evensum);
    }


}
