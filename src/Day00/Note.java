package Day00;

/*
    看到那里了？
    7-分支结构-上

    编译compile:
    .java 源文件 ==编译==》.class字节码文件
    运行：
    JVM负责加载并运行.class字节码文件

    JVM: Java Virtual Machine 加载运行 .class文件
    JRE: Java Runtime Environment JRE=JVM+kits
    JDK: Java Development Kits JDK=JVM+JRE

    要运行Java文件，至少要有JRE
    要做JAVA开发，必须要有JDK

    Java Project: community
    Java package: building
    class: special unit
    main: door

    Java 严格区分大小写 System ≠ system
    所有的符号都是英文符号

    不可重复声明变量

    变量起名规则，小驼峰命名法 myMathScore
    类起名规则，大驼峰命名法 MathTest

    1 TB = 1024 GB
    1 GB = 1024 MB
    1 MB = 1024 KB
    1 KB = 1024 b
    1 b  = 8 bit

    整理代码格式的快捷键: ctrl + alt + l
    快速注释当前光标选中行代码的快捷键:ctrl + /
    tab键(Table) --->可以生成4个空格

    占用大小
    byte - short - int - long - float - double

    Sacnner 扫描显示台中用户输入的内容并接收

    循环:
    1, while
    2, do while
    3, for

    三要素
    1，int count = 0; //循环变量的初始化
    2，count < 3; //基于循环变量的条件
    3，count++; //循环变量的改变

    随机数
    Math.random(); 该功能，会返回一个double类型的小数，范围是从0到1(取不到上限1)

    while和do while的区别
    相同点：
        不明确循环次数，但知道循环条件
    不同点：
        while先判断循环条件，如果成立了才会执行循环体，可能循环体一次都不做
        do while，先执行一次循环体，再判断while内的循环条件，至少做一次循环

    双层for循环

    /n 换新的一行
    /t 空一个table的距离(4个空格)

                      行数         列数
    双重for循环，外层控制轮数，内层控制次数

    数组代表一组相同类型元素的集合，数组是引用类型
    int a =100;
    int b =99;
    int c =88;
    当需要大量存储同一类型的多个数据时，就可以使用数组

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
    1，无参，无返回值
    2，有参，无返回值
    3，无参，有返回值
    4，有参，有返回值

    面向对象三大特征
    类和对象
    例子：问：狗是什么颜色？
    狗    人类    月饼模具
    类：抽象的，不具体的事物。一类事物的总成，在程序中是模板
    金毛    李哥    月饼
    对象：具体的一个事物

    数据冗余，用类来解决

    类：
        放该类别下所有对象共有的属性/数据 ------变量
        放该类别下所有对象共有的行为      ------方法
        class Person{//人类
            //共有的属性/数据
            //变量:
            String name;
            int age;
            String sex;
            double height;

            //共有的行为
            //方法：
            void eat(){ //吃

            }
            void sleep(){ //睡

            }
            void play(){ 玩

            }

            class car{
                //共有的属性
                String color;
                String brand;

                //共有的行为
                run(){ //前进

                }

                back(){ //后退

                }
            }

            变量
            成员变量/全局变量：类中，方法外，作用于整个类中（包含方法）
            局部变量：方法中，只作用于当前方法中

            封装
            将一类别下所有对象共有的属性和行为，封装到一个共有的模板中

            创建对象
            Scanner s = new Scanner();
            Student stu = new Student(); //创建一个学生对象
            Student s1= new Student();

            创建对象的语法
          引用数据类型   变量名    new   引用数据类型();
            Student     stu   =  new  Student();

        项目分析
        深海杀手
        1,识别对象
            战舰，深水炸弹，侦察潜艇，鱼类潜艇，水雷潜艇，水雷，鱼类

        2,分配职责
            战舰(玩家): 发射深水炸弹
            深水炸弹: 攻击潜艇，
                    1，打到潜艇，炸弹和潜艇消失在屏幕上
                    2，打到侦察潜艇，+10分。打到鱼类潜艇，加40分。 ----加分
                    3，打到水雷潜艇，+一条命。                   ----加明
             鱼雷潜艇: 可以发射鱼类，攻击战舰
                    1，鱼类消失
                    2，战舰减一条命，若生命值小于等于0，游戏结束
              水雷潜艇: 可以发射水雷，攻击战舰
                    1，水雷消失
                    2，战舰减一条命，若生命值小于等于0，游戏结束
         3, 建立交互

         建一个项目包
         存在7个对象，需要7个模板类
         1，战舰类        BattleShip
                        属性：X,Y 坐标；宽高；速度speed；
                        行为：移动；
        2，深水炸弹类       Bomb
                        属性：X,Y 坐标；宽高；速度speed；
                        行为：移动；
        3，侦察潜艇类       ObserverSubmarine
                        属性：X,Y 坐标；宽高；速度speed；
                        行为：移动；
        4，水雷雷潜艇类       MineSubmarine
                        属性：X,Y 坐标；宽高；速度speed；
                        行为：移动；
        5，鱼雷潜艇类       TorpedoSubmarine
                        属性：X,Y 坐标；宽高；速度speed；
                        行为：移动；
        6，水雷类       Mine
                        属性：X,Y 坐标；宽高；速度speed；
                        行为：移动；
        7，鱼雷类       Torpedo
                        属性：X,Y 坐标；宽高；速度speed；
                        行为：移动；
        }

        更快捷的赋值，构造方法
        如果为类添加构造方法，系统不赠送默认的无参构造方法
        构造方法可以重载，只要满足参数类型或参数个数不同即可
        局部变量与成员变量的名字时可以一样的，在使用变量时，遵循就近原则

        this 代表当前对象，哪个对象调用方法，那哥们方法中的成员变量代指的就是那个对象
        this 可以解决当局部变量与成员变量名字成同时，可以通过使用this关键字来明确表示访问的是当前成员变量

        引用类型的数据的值默认都是null(String, 数组, 自定义类)
        值类型: 0, 0.0
        boolean类型默认值false

        当使用空对象去访问内容时,会报NullPointerException:空指针异常


 */
public class Note {
}
