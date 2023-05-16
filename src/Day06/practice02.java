package Day06;


public class practice02 {
    public static void main(String[] args) {

        getFactorial(3);

        System.out.println(getEveryNum(567));

        for(int i =100; i<1000;i++){

            if(i ==flower(i)){
                System.out.println(i+"是水仙花数");
            }
        }
    }

    /*
    做一个方法，求10以内的阶乘的和
    例如
    传入5，立即计算1*2*3*4*5 的总和
    方法名称:
    getFactorial();
    */
    static void getFactorial(int num){
        int sum = 1;
        for (int i = 1; i<=num; i++){
            sum *= i;
        }
        System.out.println(sum);
    }

    /*
        获取一个三位数，把每一位相加的和作为输出结果
        例如：输入111，返回1+1+1 = 3
        getEveryNum();
     */

    static int getEveryNum(int i){
        int a = i/100;
        int b = (i%100)/10;
        int c = i%10;
        return a+b+c;
    }


    /*
        100-1000内的水仙花数(一个三位数)
        个位，十位，百位的三次幂相加等于原来的数据
        例如：153
        1*1*1* + 5*5*5* +3*3*3 = 153
     */

    static int flower(int a) {
        int x = a / 100;
        int y = (a % 100) / 10;
        int z = a % 10;
        int b = 0;
        if (a == (x * x * x) + (y * y * y) + (z * z * z)) {
            b = a;
//            System.out.println(a);
        }
        return b;
    }

}
