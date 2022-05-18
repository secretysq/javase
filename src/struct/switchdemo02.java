package struct;

public class switchdemo02 {
    public static void main(String[] args) {
        String name = "杨波";

        //jdk7的新特性，表达式结果可以是字符串。
        //字符的本质还是数字
        //反编译 Java---class（字节码文件）---反编译（idea）

        switch (name){
            case "马波":
                System.out.println("马波");
                break;
            case "杨波":
                System.out.println("杨波");
                break;
            default:
                System.out.println("天波");
        }
    }
}
