package Day04;

import java.util.Scanner;

/**
 * switch case 演示类
 * <p>
 * switch(变量){
 * case 1:
 * 符合case 1 条件所执行的语句;
 * break;
 * case 2:
 * 符合case 2 条件所执行的语句;
 * break;
 * ......
 * default:
 * 不符合上述所有情况所执行的语句;
 * }
 * <p>
 * break: 退出当前代码块
 */
public class SwitchCase {
    public static void main(String[] args) {
        //程序运行，开启服务，根据提示选择对应的指令
        Scanner s = new Scanner(System.in);
        System.out.println("请输入指令： 1 代表中文服务;2 代表英文服务; 0 退出");
        int user = s.nextInt();
        switch (user) {
            case 1:
                System.out.println("您好，这里是中文客服!");
                break;
            case 2:
                System.out.println("您好，这里是英文客服!");
                break;
            case 0:
                System.out.println("您好，再见！");
                break;
            default:
                System.out.println("您输入的指令有误");
        }
        System.out.println("祝您有个美好的一天");
    }
}
