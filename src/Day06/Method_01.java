package Day06;
/*
方法：
    一个方法就是一个功能
    当在程序中，遇到重复冗余的代码时，我们就可以用方法来进行封装（包装）
    语法
    [访问修饰符]返回值类型 方法名称([参数]){方法体}
    访问修饰符:
    返回值类型：当方法体中的业务代码产生了结果，需要将结果返回给调用者，我们需要再返回值类型的地方写上对应结果的类型。
        例如: return 结果;
        如果没有返回值，我们用void表示无返回值;
    建议使用小驼峰命名法
    方法参数：当实现本方法的业务逻辑时，需要让调用者传递数据后才能完成对应的业务，则可以写方法参数，若没有需求，则不写
    方法体：存放本方法对应的功能逻辑的位置。
    方法的分类
    1，无参，无返回值: 封装一段重复的业务逻辑
    2，有参，无返回值
    3，无参，有返回值
    4，有参，有返回值
 */
public class Method_01 {
    public static void main(String[] args) {
//        System.out.println("运球");
//        System.out.println("胯下");
//        System.out.println("突破");
//        System.out.println("上篮");
//
//        System.out.println("运球");
//        System.out.println("胯下");
//        System.out.println("突破");
//        System.out.println("上篮");
//
//        System.out.println("运球");
//        System.out.println("胯下");
//        System.out.println("突破");
//        System.out.println("上篮");

        breakthrough(); //调用方法
        System.out.println("程序继续向下执行");
    }
    //无返回值的方法    ---自定义的方法 如果不调用 方法则不会被执行
    static void breakthrough(){
        System.out.println("运球");
        System.out.println("胯下");
        System.out.println("突破");
        System.out.println("上篮");
    }
}
