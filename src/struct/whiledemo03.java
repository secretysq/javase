package struct;

public class whiledemo03 {
    public static void main(String[] args) {

        //1+2+3...+100=?
        int i=0;
        int sum=0;
        while (i<=100){
            sum = sum + i;
            i++;

        }
        System.out.println(sum);
    }
}

