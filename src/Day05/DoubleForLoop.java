package Day05;
/*
    双重for循环的使用演示类
 */
public class DoubleForLoop {
    public static void main(String[] args) {
        //案例 99乘法表
        for(int num = 1; num <=9;num++){
            for(int i =1; i<=num;i++){
                System.out.print(i+"*"+num+"="+(i*num)+"\t"); //把println改为print。println换行，print不换行

            }System.out.println();
        }

        for(int num = 1; num <=5;num++){
            for(int i =1; i<=num;i++){
                System.out.print("※"); //把println改为print。println换行，print不换行

            }System.out.println();
        }
    }

    //5行5列的星星

}
