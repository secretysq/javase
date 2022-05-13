package operator;

public class demo02 {
    public static void main(String[] args) {
        long a = 1222333322222l;
        int b = 123;
        short c = 10;
        byte d = 8;
        System.out.println(a+b+c+d);
        System.out.println(b+c+d);
        System.out.println(c+d);   //结果默认为int
        System.out.println("-----------------------------------------------");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(b%c);     //取余，模运算
        System.out.println("-----------------------------------------------");
        //++ -- 自增，自减  一元运算
        int e = 3;
        int f = e++;   //执行完这行代码后，先给f赋值，再自增        a = a + 1;
        System.out.println(e);
        int g = ++e;   //执行完这行代码后，先再自增，再给f赋值       a = a + 1;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println("-----------------------------------------------");
        //与 and        或 or        非  取反
        boolean h = true;
        boolean j = false;
        System.out.println("h && b:"+ (h&&j));     //逻辑与运算：两个变量都为真，结果为真
        System.out.println("h || b:"+ (h||j));     //逻辑或运算：两个变量一个为真，结果为真
        System.out.println("!(a && b):"+ !(h&&j)); //如果是真，结果为假，如果是假，结果为真
        //短路运算   假设前面为错误，后续代码不运行

        //2*8=16 << 等于做乘法  *2   >> 做除法 /2
        System.out.println(2<<2);

        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");
        //System.out.println("-----------------------------------------------");

    }
}
