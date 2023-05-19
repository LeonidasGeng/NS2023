package OO.Day01;

/*
    学生模板类
        共有的属性和行为

        注意
            只有测试类，才会加main功能
            模板类中无需加main

 */
public class Student {

    //共有属性
    String name;
    int age;
    int stuID;

    //构造方法
    Student(String name, int age, int stuID){//由创建对象时来传递具体数据
//        System.out.println("学生类的构造方法被调用了");
        this.name=name;
        this.age=age;
        this.stuID = stuID;
//        study(); //调用stu这个对象的study的行为
//        sayHi(); //调用stu这个对象的sayHi的行为
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(stuID);
    }

    void study() {
        //this 代表/指向当前调用方法的对象
        System.out.println(this.name + "在刻苦学习");

    }

    void sayHi() {
        System.out.println("大家好，我叫" + this.name + ",今年我" + this.age + "岁了, 我的学号是" + stuID);
    }

    Student(){

    }
}
