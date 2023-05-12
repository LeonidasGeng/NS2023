package Day04;

/**
 * 单路分支的使用演示类
 */
public class If {
    public static void main(String[] args) {
        /**
         *语法演示
         * if---->如果
         * if(boolean){
         *      //成立所执行的代码块
         * }
         * 判断过程：
         *      判断if小括号里的boolean值
         *      若为true，则执行if成立的代码块
         *      若为false,代码跳过if代码块，继续向后执行......
         */
        //购物满500，打8折
        double price = 300;
        if (price >= 500) {
            price = price * 0.8;
            System.out.println("消费满500了，打8折，打完折的价格为: " + price);
        }
        System.out.println("应付款为: " + price);
    }
}
