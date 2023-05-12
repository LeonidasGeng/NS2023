package Day04;

import java.util.Scanner;

/**
 * 2，依次输入3个整数，打印最大值
 */
public class Assignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入三个整数，我会给你最大值");
        System.out.println("请输入第一个整数: ");
        int num1 = s.nextInt();
        System.out.println("请输入第二个整数: ");
        int num2 = s.nextInt();
        System.out.println("请输入第三个整数: ");
        int num3 = s.nextInt();
        //解法1
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("这三个值中最大值是: " + num1);
//        }
//        if (num2 > num1 && num2 > num3) {
//            System.out.println("这三个值中最大值是: " + num2);
//        }
//        if (num3 > num1 && num3 > num1) {
//            System.out.println("这三个值中最大值是: " + num3);
//        }

        //解法2
        int max1 = num1 > num2 ? num1 : num2;
        int max2 = max1 > num3 ? max1 : num3;
        System.out.println("这三个值中最大值是: " + max2);
    }
}
