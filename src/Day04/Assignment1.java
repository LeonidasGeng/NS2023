package Day04;

import java.util.Scanner;

/**
 * 1，输入一个整数，1，石头；2，剪刀；3，布
 */
public class Assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数(范围1~3): ");
        int num1 = s.nextInt();
        if (num1 == 1) {
            System.out.println("石头");
        }
        if (num1 == 2) {
            System.out.println("剪刀");
        }
        if (num1 == 3) {
            System.out.println("布");
        }
    }
}
