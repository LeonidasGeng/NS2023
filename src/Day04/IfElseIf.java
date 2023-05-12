package Day04;

import java.util.Scanner;

/**
 * 多路分支结构
 */
public class IfElseIf {
    /**
     * 语法结构
     * if(条件1){
     * 条件1成立所执行的代码块
     * }else if(条件2){
     * 条件2成立所执行的代码块
     * }else if(条件3){
     * 条件3成立所执行的代码块
     * }
     * ......
     * else{
     * 以上所有条件都不成立时所执行的代码块
     * }
     * <p>
     * <p>
     * 执行过程:
     * 先去判断条件1 是否成立，若成立则执行条件1成立所执行的代码块
     * 否则去判断条件2 是否成立，若成立则执行条件2成立所执行的代码块
     * 否则去判断条件3 是否成立，若成立则执行条件3成立所执行的代码块
     * ......
     * <p>
     * 使用情形
     * 当对一份数据有不同的判断条件时，我们应该使用多路分支
     */
    public static void main(String[] args) {
        //根据用户输入的分数，来判断他的成绩等级
        //score >= 90 : A
        //80 <= score < 90 : B
        //70 <= score < 80 : C
        //60 <= score < 70 : D
        //score < 60 : F
        Scanner s = new Scanner(System.in);
        System.out.println("请输入您的分数");
        double score = s.nextDouble();
        if (score >= 90) {
            System.out.println("您的成绩为: A");
        } else if (80 <= score && score < 90) {
            System.out.println("您的成绩为: B");
        } else if (70 <= score && score < 80) {
            System.out.println("您的成绩为: C");
        } else if (60 <= score && score < 70) {
            System.out.println("您的成绩为: D");
        } else {
            System.out.println("您的成绩为: F");
        }
    }
}
