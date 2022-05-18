package struct;
// TODO: 2022/5/18 else if语句
import java.util.Scanner;

public class IFdemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        if 语句至多有一个else，else语句必须在所有的else if语句之后。
        if语句可以有若干个else if，他必须在else之前
        一旦其中一个else if语句检测为true，其他的else if以及else语句都跳过执行。
         */
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();

        if (score == 100){
            System.out.println("满分");
        }else if(score<100 && score>=90){
            System.out.println("优秀");
        }else if(score<90 && score>=80){
            System.out.println("良好");
        }else if(score<80 && score>=70){
            System.out.println("普通");
        }else if(score<60){
            System.out.println("不及格");
        }else if(score < 0 || score > 100){
            System.out.println("成绩不符合规则，请重新输入");
        }


        scanner.close();
    }
}
