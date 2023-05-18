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

    void study() {
        //this 代表/指向当前调用方法的对象
        System.out.println(this.name + "在刻苦学习");
    }

    void sayHi() {
        System.out.println("大家好，我叫" + name + ",今年我" + age + "岁了, 我的学号是" + stuID);
    }
}
