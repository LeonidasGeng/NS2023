package Day06;
/*
无参，有返回值的方法
使用：
    当方法体的业务逻辑完成时，需要传递给调用者的信息，则使用有返回值
 */
public class Method_03 {
    public static void main(String[] args) {
        double a = getPi(); //调用有返回值的方法时，根据需要来进行接收返回的数据
        System.out.println(a);

        System.out.println((float)(Math.PI));
    }

    //做一个功能，调用者使用这个功能，可以拿到pi值， 3.1415926
    //一旦方法定义了返回值类型，方法体在结束代码块之前，一定要用return 来返回结果，否则报错
    static double getPi(){
        return 3.1415926;
      //👆 返回并退出
    }
}
