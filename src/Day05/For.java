package Day05;

/*
    For循环（最常见）
    适用性：
    当已知循环次数，不明确循环条件
    基础语法/结构:
    for(变量初始化;循环变量的条件;循环变量的改变){
        循环体
    }
    程序结束条件：循环变量的条件不被满足

    continue: 跳过当次循环，直接中止运行余下程序，直接执行下次循环
    break: 在循环中遇到break,表示退出循环体;



 */
public class For {
    public static void main(String[] args) {
        //输出3次Hello world
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World!");
        }

        //10以内的奇数和偶数
        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println(i + "是偶数");
                continue;
            }
            System.out.println(i + "是奇数");
        }

        //李哥上场3分钟就要被换下
        for (int i = 1; i <= 40; i++) {
            if (i > 3) {
                System.out.println("李哥被换下场！");
                break;
            }
            System.out.println("李哥上场已经" + i + "分钟了!");
        }
        System.out.println("他的表现太糟糕了");

    }
}
