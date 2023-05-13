package Day05;

import java.util.Scanner;

/*
输入年龄，判断人生阶段
0-5：幼年
5-12：少年
12-18：青年
18-30：成年
30-50：中年
50-65：中老年
65-90：老年
 */
public class Assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入您的年龄: ");
        int age = s.nextInt();
        if (0 <= age && age < 5) {
            System.out.println("您处于幼年阶段");
        } else if (5 <= age && age < 12) {
            System.out.println("您处于少年阶段");
        } else if (12 <= age && age < 18) {
            System.out.println("您处于青年阶段");
        } else if (18 <= age && age < 30) {
            System.out.println("您处于成年阶段");
        } else if (30 <= age && age < 50) {
            System.out.println("您处于中年阶段");
        } else if (50 <= age && age < 65) {
            System.out.println("您处于中老年阶段");
        } else if (65 <= age && age < 90) {
            System.out.println("您处于老年阶段");
        } else {
            System.out.println("您真是太牛逼了！");
        }
    }
}
