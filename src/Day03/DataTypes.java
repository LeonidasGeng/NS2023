package Day03;

/*
    数据类型的作用
        决定了变量可以储存的类型和范围
    数据类型
        基本数据类型 ，常用5种
        总共8种: byte, short, int, long, float, double, char, boolean
        常用5种: int, long, double, char, boolean
        引用数据类型

    基本数据类型 常用5种
        整数：int, long
        小数：float, double
        字符：char
        判断：boolean

    不常用：
        byte（涉及到IO相关知识才常用到）
        short & float(存储范围小)

    整数类型
        int 占用4个字节，储存范围，-21亿至+21亿
        ling 占用8个字节，储存范围-900万万亿至+900万万亿
    整数之间的运算得出的结果还是整数
    长整数需要在数字后加L保持不出错

    小数类型
        double 占用8个字节
        小数都默认为double类型
        double类型的数据
        double数据可以在后面加上D表示是double
        运算时可能出现误差

    boolean 类型
        boolean占用1个字节
        只存储 true 或 false

    字符：
    char, 必须是单引号
    字母，数字，符号等
    打印特殊字符，需要用  \    例如 '\''

    占用大小
    byte - short - int - long - float - double

    类型转换


 */
public class DataTypes {
    public static void main(String[] args) {
        int a = 100; //声明一个变量类型为int, 名字为a, 并储存值 100; 不能超过int规定的最小/大值±2147483647

        //整数之间的运算得出的结果还是整数
        System.out.println(5 / 2); // 2

        long b = 10000000000L;

        double c = 3.14;
        double d = 2.99;
        System.out.println(c - d); //0.1499999999999999 可能会出现误差

        boolean e = true;
        System.out.println(e);
        boolean f = false;
        System.out.println(f);

        char g = 'a';
        //char g = 'ab'; 报错，字符中只能有单个字符
        System.out.println((int) g); //97

        System.out.println('\''); // '
        System.out.println('\\'); // \

        //自动类型转换 小类型转换为大类型
        int h = 100; //没有发生自动类型转换
        long i = h; //发生了自动类型转换
        double j = i; //发生了自动类型转换
        System.out.println(h + " " + i + " " + j);

        //强制类型转换，需要在转换的便两千加上一组小括号，括号里写入需要专函的类型即可
        long k = 1000000000L;
        //int l = k; //报错，long是大类型，int是小类型
        int l = (int) k;
        System.out.println(l + " " + k);

        long m = 3000000000L;
        //int n = m; //报错，long是大类型，int是小类型
        int n = (int) m; //强转有风险，使用需谨慎
        System.out.println(m + " " + m);

        double o = 3.1415926;
        int p = (int) o; //将小数强转为整数时，会阶段删除小数
        System.out.println(p); //3

        //整数可以直接赋值给byte, short, char, 但不能超过其范围
        byte q = 127;
//        byte r = 128; 报错，byte范围±127

        char s = 65535;
//        char t = 65536;报错，char范围±65535

        //byte short char 进行运算时，系统自动转换结果为int

        byte u = 1;
        byte v = 2;
//        byte w = u+v;  u+v的结果变为int类型
        byte w = (byte) (u + v);

        char x = '2'; //50
        char y = '2'; //50
        System.out.println(x + y);
        char z = (char) (x + y);
        System.out.println(z);

        //小类型与大类型进行运算时，系统自动将结果转换为大类型
        byte a1 = 100;
        int b1 = a1 + 20; //byte 小类型，int 大类型，运算的数据类型为大类型
        System.out.println(b1);
    }
}
