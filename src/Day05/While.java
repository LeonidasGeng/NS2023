package Day05;

/**
 * while循环的使用演示类
 */
public class While {
    public static void main(String[] args) {
        /**
         *while的语法演示：
         * //1,循环变量的初始化
         * 1.
         * //2，循环代码块
         * while(2.){
         *     循环条件成立所执行的代码块
         *     3.
         * }
         *
         * 执行过程
         *      先去判断while小括号中的条件是否成立
         *      若成立 则执行循环代码块 执行完后会再次判断while小括号中的条件
         *      若成立，则再次执行循环代码块 执行完后会再次判断while小括号中的条件
         *      ......
         *      直至判断while小括号中的条件不成立，代码继续向后执行......
         *
         */
        //打印10次Hello World
        //1, 循环变量的初始化   2,基于循环变量的条件    3，循环变量的改变(必须)
        int count = 0;//1
        while (count <10){
            System.out.println("Hello World!");
            count++;
        }
        System.out.println("程序结束，已打印10次\"Hello World!\"");


        //一个球，从100米的高度落下，每次反弹是原始高度的一般 用while循环实现
        //问：1，总共弹起多少次
        //   2，总共弹起多少米


    }
}
