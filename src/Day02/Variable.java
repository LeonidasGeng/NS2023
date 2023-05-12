package Day02;

/*
    variable：变化的量，就是来储存数据的

    1，变量的声明 开账户
        int a; 声明了1个整数int的变量 变量名为a
        int b,c,d; 声明了3个整数int的变量 变量名封面别为b,c,d;
    2，变量的初始化 给账户值
        =  赋值符号，从右向左赋值
        int a = 300; 声明 declare 时初始化

        int b; 先声明
        b = 300; 声明完再给值

    3，变量的使用
        int c = 5;
        int d = c + 10; 使用c，而不改变c
        int d = 20; 报错，不可重复声明变量 variable b is already defined in method main

    4，变量的命名规范
        4.1，变量只能包含数字，字母，_和$, 不能以数字开头，不能加空格
            int y_$2;
            int 2y_$; 报错，不能以数字开头
            int ag e = 12; 报错，不能包含空格
        4.2，变量区分大小写
            int y =13;
            int Y =14;
            以上是两个不同的变量
        4.3，变量不能以关键词命名（打出来是有颜色（蓝色）的）
            int class = 13; 报错，class是关键词
            int package = 11; 报错，package是关键词
            int class_1 = 13; 正确
            int class1 = 13; 正确
            int main = 13; 正确，main不是关键词
        4.4，变量起名要有相关，必须要英文
            考试分数
            int score = 99; 好
            int point = 99; 好
            int eat = 99; 不好
            int fenshu = 99; 不好
        4.5，变量起名规则，小驼峰命名法
            int myScore = 99;
            int myMathScore = 99;


 */
public class Variable {
    public static void main(String[] args) {
        int a = 5;
        int b = a + 10;
//        int b = 30; 报错，不可重复声明变量 variable b is already defined in method main，
        b = 25; //无报错，打印最近一次赋值assigned 的数据
        System.out.println(b);
    }
}
