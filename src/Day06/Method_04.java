package Day06;

import java.util.Scanner;

/*
有参数，有返回值
return 接收数据
void 实现功能

 */
public class Method_04 {
    public static void main(String[] args) {
        /*
        写一个代码，计算1+1的结果
        写一个代码，计算12+11的结果
        写一个代码，计算11+13的结果
        功能是一样的：求和
        数据不一样 如何解决
         */
        Scanner s = new Scanner(System.in);
        System.out.println("我们要做一个加法!请输入第一个数");
        int a = s.nextInt();
        System.out.println("请输入第二个数");
        int b = s.nextInt();
        int i = sum(a,b);

        System.out.println("这两个数的和为: "+ i);

        if(i %2 ==0){
            System.out.println("这两个数的和为偶数");
        }else {
            System.out.println("这两个数的和为奇数");
        }
    }
    static int sum(int a, int b){
        return a+b;
    }


}
