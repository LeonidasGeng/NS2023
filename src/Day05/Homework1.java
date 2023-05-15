package Day05;

import java.util.Scanner;

/*
使用For循环
随机出10道100以内的加法运算，然后让用户输入答案，是否答对，答对加10份。
做完10道题后，输出信息：您本次答题共答对x题，并对等级进行判定
100:A
90:B
80:C
低于80:F

 */
public class Homework1 {
    public static void main(String[] args) {

        int right = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            int ran1 = (int) (Math.random() * 100);
            int ran2 = (int) (Math.random() * 100);
            int ans = ran1 + ran2;
            System.out.println("(" + i + ") " + ran1 + " + " + ran2 + " = ?");
            System.out.println("请回答！");
            int ipt = s.nextInt();
            if (ipt == ans) {
                System.out.println("恭喜您，您答对了");
                right++;
            } else {
                System.out.println("很遗憾，您打错了");
            }
        }
        if (right == 10) {
            System.out.println("您一共答对"+right+"题，您的最终成绩为A");
        } else if (right == 9) {
            System.out.println("您一共答对"+right+"题，您的最终成绩为B");
        } else if (right == 8) {
            System.out.println("您一共答对"+right+"题，您的最终成绩为C");
        } else {
            System.out.println("您一共答对"+right+"题，您的最终成绩为F");
        }
    }
}
