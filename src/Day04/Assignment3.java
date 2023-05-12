package Day04;

import java.util.Scanner;

/**
 * 3，声明2个变量，int a = 10; int b = 20; 交换a，b中的数据
 */
public class Assignment3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("我会把两个整数互换");
        System.out.println("请输入第一个整数: ");
        int num1 = s.nextInt();
        System.out.println("请输入第二个整数: ");
        int num2 = s.nextInt();
        int num3 = num1;
        int num4 = num2;

        System.out.println("原始数据是: "+ num1 +" " +num2);
        System.out.println("新数据是: "+ num3 +" " + num4);
    }
}
