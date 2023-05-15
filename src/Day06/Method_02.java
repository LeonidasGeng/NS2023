package Day06;
/*
有参数，无返回值
 */
public class Method_02 {
    public static void main(String[] args) {
        //当调用的方法有参数时，需要传递对应方法定义时需要的类型实际参数
        helloWorld("李哥",18);//调用方法
    }
    //方法表示的是一个功能
    //做一个hello world的功能
    //调用者决定向谁说Hello（不是world）
    //文字用String,
    //多个参数用","隔开
    static void helloWorld(String name, int age){
                         //👆形式参数，因为你不知道具体的值，只是说在ram里开辟一个空间，准备放入至
        System.out.println("Hello "+ name+", 您好，我的年龄是"+age);
    }

}
