package OO.Day01;
/*
    测试类
    用于测试学生类创建对象等相关操作的类
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建学生类
        //不仅仅创建了对象，还调用了构造方法
        Student stu = new Student("小李",18,10086);

//        stu.name="小李";
//        stu.age=20;
//        stu.stuID = 10086;
        stu.study(); //调用stu这个对象的study的行为
        stu.sayHi(); //调用stu这个对象的sayHi的行为
//        System.out.println(stu.name);
//        System.out.println(stu.age);
//        System.out.println(stu.stuID);



        Student ls = new Student("李四",19,10087);
//        ls.name="小张";
//        ls.age=25;
//        ls.stuID = 18886;
        ls.study(); //调用ls这个对象的study的行为
        ls.sayHi(); //调用ls这个对象的sayHi的行为
//        System.out.println(ls.name);
//        System.out.println(ls.age);
//        System.out.println(ls.stuID);

//        Student ww = new Student();
//        ww.name="王五";
//        ww.age=25;
//        ww.stuID = 18888;
//        ww.study(); //调用ls这个对象的study的行为
//        ww.sayHi(); //调用ls这个对象的sayHi的行为
//        System.out.println(ls.name);
//        System.out.println(ls.age);
//        System.out.println(ls.stuID);

    }
}
