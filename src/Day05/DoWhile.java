package Day05;

/**
 * do while
 * <p>
 * 语法结构
 * 1, 循环变量的初始化
 * do{
 * 3，循环体
 * }while(2.);
 * <p>
 * 执行过程:
 * 代码遇到do的结构，先执行do代码块里面的内容，然后再去判断while小括号中的条件
 * 若成立，则在执行do 代码块中的内容，然后再去判断while小括号中的条件
 * ......
 * 直至不成立    循环结束，代码块继续向下执行
 * <p>
 * do while 至少运行一次
 */
public class DoWhile {
    public static void main(String[] args) {
/*
用do while输出10次"Hello World!"
 */
        int count = 0;
        do {
            System.out.println("Hello World!");
            count++;
        } while (count < 10);

        //

        double random = Math.random();//返回一个double类型的数据，随机的范围是0~1，取不到1
        System.out.println(random);
        double ran1 = Math.random() * 100;
        System.out.println(ran1);
        int ran2 = (int)(Math.random() * 100);
        System.out.println( ran2);
    }
}
