package Day05;

import java.util.Scanner;

/**
 * do while
 * <p>
 * 语法结构
 * 1, 循环变量的初始化
 * do{
 * 3，循环体
 * }while(2.);
 * <p>
 * 执行过程:
 * 代码遇到do的结构，先执行do代码块里面的内容，然后再去判断while小括号中的条件
 * 若成立，则在执行do 代码块中的内容，然后再去判断while小括号中的条件
 * ......
 * 直至不成立    循环结束，代码块继续向下执行
 * <p>
 * do while 至少运行一次
 */
public class DoWhile {
    public static void main(String[] args) {
/*
用do while输出10次"Hello World!"
 */
        int count = 0;
        do {
            System.out.println("Hello World!");
            count++;
        } while (count < 10);

        //

        double random = Math.random(); //返回一个double类型的数据，随机的范围是0~1，取不到1
        System.out.println(random);
        double ran1 = Math.random() * 100; //返回范围0-100的类型为double的随机数
        System.out.println(ran1);
        int ran2 = (int) (Math.random() * 100); //返回范围0-100的类型为int的随机数
        System.out.println(ran2);

        //要求随机数的区间 100~130
        //公式 Math.random() * (最大值-最小值) +最小值
        //变int类型 (int)(Math.random() * (最大值-最小值) +最小值)
        double ran3 = Math.random() * (130 - 100) + 100;
        int ran4 = (int) (Math.random() * (130 - 100) + 100);
        System.out.println(ran4);

        //猜大小
        //要求:运行产生一个随机数，整数，0-100，让用户在显示台中输入数字猜大小，大：猜大了；小：猜笑了；正好：猜对了
        int ran = (int) (Math.random() * 100);
        Scanner s = new Scanner(System.in);
//        System.out.println("请猜本次幸运数字(0-99)!");
//        int input = s.nextInt();
//        if (input > ran) {
//            System.out.println("您猜的数字大了!");
//        } else if (input < ran) {
//            System.out.println("您猜的数字小了!");
//        } else {
//            System.out.println("恭喜，您猜中了!");
//        }

        int input1;
        //版本更新 一直猜，猜中了程序才能停止
        do{
            System.out.println("请猜本次幸运数字(0-99)!");
            input1 = s.nextInt();
            if (input1 > ran) {
                System.out.println("您猜的数字大了!");
            } else if (input1 < ran) {
                System.out.println("您猜的数字小了!");
            } else {
                System.out.println("恭喜，您猜中了!");
            }
        }while(input1 != ran);
        System.out.println("恭喜您，猜对了!");
    }
}
