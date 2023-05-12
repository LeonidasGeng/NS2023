package Day03.operation;

import java.util.Scanner;

/**
 * 数学运算符
 * + 加
 * - 减
 * * 乘
 * / 除
 * % 取余（获取当前除法运算的余数）
 * <p>
 * 自增自减
 * 自增：在变量自身基础上增加1，符号++
 * 自减：在变量自身基础上减少1，符号--
 * 作用于变量
 * 1，单独运算时，只有当前变量被运算，符号在前在后都一样
 * 2，参与运算时，符号在前在后不一样
 * 符号在前，先执行符号对应的自增或自减，然后再去参与其他运算
 * 符号在后，先去参与其他运算，再去执行符号对应的自增或自减
 * <p>
 * 关系运算符
 * 结果必定是 Boolean 值
 * 大于>, 小于<, 等于==,大于等于>=, 小于等于<=, 不等于!=
 * <p>
 * 逻辑运算符
 * 与/并且 && : 在逻辑与/并且关系中，有两个或多个条件，只要有一个条件不成立，其结果一定不成立(只要有一个false,整个结果就是false)
 * 或/或者 // : 在逻辑或/或者关系中，只有两个或多个条件，要有一个条件成立，其结果一定成立(只要有一个true,整个结果就是true)
 * 非/取反 ! : 结果取反。!true 结果是 false;    !false 结果是 true
 * <p>
 * 赋值运算符
 * 赋值符号 =
 * 赋值顺序： 从右往左赋值
 * 扩展赋值符号： +=, -=, *=, /=    在自身基础上快速进行运算，并将运算的结果赋值给自身
 */
public class operationDemo {
    public static void main(String[] args) {
        //1, 数学运算符
        int a = 10;
        int b = 3;
        int c = a + b;
        System.out.println(a + b); //13
        System.out.println(c);   //13
        System.out.println(a - b); //7
        System.out.println(a * b); //30
        System.out.println(a / b); //3
        System.out.println(a % b); //1

        //取余操作时,左边的数据 小于右边的数据  余数则为左边的数据
        //可以通过取余2，判断是偶数还是奇数
        System.out.println(1 % 3); //1
        System.out.println(2 % 3); //2
        System.out.println(3 % 3); //0

        //2，自增自减运算符
        int e = 5;
        e++; //变量单独被运算一次
        System.out.println(e); //6
        e--; //
        System.out.println(e); //5

        //1，单独运算时，只有当前变量被运算，符号在前在后都一样
        //2，参与运算时，符号在前在后不一样
        //  符号在前，先执行符号对应的自增或自减，然后再去参与其他运算
        //  符号在后，先去参与其他运算，再去执行符号对应的自增或自减
        int f = 5; //6
        int g = 10; //11
        int h = f++; //5
        int i = ++g; //11
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        int j = 5; // 4
        int k = 10; // 9
        int l = j--; // 5
        int m = --k; // 9
        //赋值的运算优先度最低
        int n = --j - k--; //(5-1-1) - 9 = -6, then j = 3, k = 9-1 = 8
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);

        //面试题
        int o = 1;
        o = o++;
        System.out.println(o);

        int p = 2;
        p = ++p;
        System.out.println(p);

        int q = 50;
        int r = 40;
        int s = 50;
        boolean t = q > r;
        System.out.println(t); //true
        System.out.println(q > r); //true
        System.out.println(r > q); //false
        System.out.println(r == q); //false
        System.out.println(q == s); //true
        System.out.println(q >= s); //true
        System.out.println(q <= s); //true
        System.out.println(q >= r); //true
        System.out.println(q <= r); //false
        System.out.println(q != r); //true
        System.out.println(q != s); //false

        //3, 逻辑运算符
        int u = 5;
        int v = 10;
        int w = 5;

        boolean x = u > v && v > w;
        System.out.println(x); // false && true : false

        boolean y = u > v || v > w;
        System.out.println(y); // false && true : true

        boolean z = u == ++v || v > w; // 5==(5+1) false || 6>5 true : true
        System.out.println(y); // false && true : true

        System.out.println(!true); //false
        System.out.println(!false); //true

        //判断是否是闰年
        //条件1：年份能被4整除，且年份不能被100整除
        //或
        //条件2：年份能被400整除
        int year1 = 2020; //年份
        boolean r1 = year1 % 4 == 0 && year1 % 100 != 0; //条件1
        boolean r2 = year1 % 400 == 0; //条件2
        boolean result1 = r1 || r2; //条件1 或 条件2
        System.out.println(result1);
        //简化
        boolean result2 = (year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0);
        System.out.println(result2);

        //Scanner
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入想查看是否是闰年的年份");
        int year2 = ss.nextInt(); //接收显示台/控制台中用户输入的int类型的数据，并存储给变量
        boolean result3 = (year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0);
        System.out.println(result3);

        //短路逻辑
        //当与/并且的关系中，只要遇到第一个false，程序就停止运行，不看之后的结果，直接返回false
        //当或/或者的关系中，只要遇到第一个true，程序就停止运行，不看之后的结果，直接返回true

        //赋值运算符
        //1，扩展赋值运算符
        int a1 = 10;
        a1 += 10; //等价于 a1 = a1+10;
        System.out.println(a1); //10+10 = 20
        a1 -= 10; //等价于 a1 = a1-10;
        System.out.println(a1); //20-10 = 10
        a1 *= 10; //等价于 a1 = a1*10;
        System.out.println(a1); //10*10 = 100
        a1 /= 10; //等价于 a1 = a1/10;
        System.out.println(a1); //100/10 = 10
        a1 %= 10; //等价于 a1 = a1%10;
        System.out.println(a1); //10/10 = 1······0

        //2,三元运算符
        //格式： boolean?值1:值2;
        //判断的逻辑?成立返回值1:不成立返回值2;
        //接收类型要与值1和值2类型相同
        int a2 = 10;
        int b2 = 80;
        int c2 = a2 > b2 ? a2 : b2; //接收值需要用跟a2和b2相同的类型
        System.out.println(c2);
        int d2 = 12;
        boolean e2 = d2 % 2 == 0 ? true : false;
        System.out.println(e2);

        //字符串拼接
        //字符是char类型，用单引号来储存，只能储存一个字符
        //字符串是String类型，用双引号来储存，可以储存多个字符
        //1, 使用+号时，若两边都是数值类型，则进行运算操作
        //2, 使用+号时，若两边有一方是字符串类型，从""开始，进行拼接操作

        //1 + 1 = 2；
        //1 + ‘1’ = “11”;

        System.out.println(1 + 1);
        System.out.println(1 + "1");
        String name = "李耕";
        System.out.println("我的名字是"+name);
        System.out.println(10 + 10 +""+30); //2030, 10+10 = 20 + ""=变字符串"20"+"30"=2030
        System.out.println("" + 6 + 6 + 6); //666
        System.out.println(10 + 10 + 10 + 30 + "");//50

    }
}
