package Day04;

/**
 * 双路分支的使用演示类
 */
public class IfElse {
    public static void main(String[] args) {
        /**
         * 语法结构
         * if(boolean){
         *     if成立所执行的代码块
         * } else{                ------else否则
         *     if不成立所执行的代码块
         * }
         */
        //超市买商品
        //超过500，打8折
        //未超过500，打9折
        double price = 501;
        if (price >= 500) {
            price = price * 0.8;
            //price *= 0.8;
            System.out.println("支付超过500，打8折，折后应付款: " + price);
        } else {
            price = price * 0.9;
            //price *= 0.9;
            System.out.println("支付超过500，打8折，折后应付款: " + price);
        }
        System.out.println("应付款: " + price);
    }
}
