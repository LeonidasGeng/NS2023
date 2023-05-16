package Day06;

public class Overload {
    public static void main(String[] args) {
        //方法功能相同，参数数据类型不同或个数不同
        //此时使用method overload
        //方法名字相同
    sum(1,2);
    sum(2.2,3);
    sum(1,2,3);

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
