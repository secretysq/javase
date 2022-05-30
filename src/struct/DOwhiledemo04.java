package struct;

public class DOwhiledemo04 {
    public static void main(String[] args) {

        //1+2+3...+100=?
        int i=0;
        int sum=0;
        do {
            sum = sum + i;
            i++;
        }
        while (i<=100);
        System.out.println(sum);
    }
}

