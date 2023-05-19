package cn.tedu.submarine;
/*
    游戏窗口类/运行类
        负责加载运行游戏
        存放的就是运行时对象交互的逻辑
 */
public class GameWorld {
    BattleShip ship;//声明了一个ship成员变量
    Bomb bomb;
    ObserverSubmarine os;
    MineSubmarine ms;
    TorpedoSubmarine ts;
    Mine m;
    Torpedo t;

    void action(){
        ship = new BattleShip(); //创建一个战舰对象，并将对象赋值给ship
        ship.x=100;
        ship.y=200;
        ship.width = 120;
        ship.height =80;
        ship.speed = 30;

        bomb = new Bomb();
        //重复 ship
        bomb.x=100;
        bomb.y=200;
        bomb.width = 50;
        bomb.height =30;
        bomb.speed = 2;
        //重复 ship

        os = new ObserverSubmarine();
        //又要重复

        ms = new MineSubmarine();
        ts = new TorpedoSubmarine();
        m = new Mine();
        t = new Torpedo();


    }
    public static void main(String[] args) {
        GameWorld gw = new GameWorld();
        gw.action();
    }

    /*
    为什么要将各类型变量的声明放main外面呢？
        在main方法中声明的变量为局部变量，但是后面当前类在的还有很多方法需要用到这些类型的变量
        所以应该设计为成员变量，作用域在整个类中
    为什么单独写一个action方法呢？
        main是用static修饰的方法，普通的成员（成员变量，普通方法）是无法被main直接访问的，
        所以做一个普通的方法来进行测试
    为什么要创建GameWorld对象去调用action方法？
        main是用static修饰的方法，普通的成员（成员变量，普通方法）是无法被main直接访问的，
        我们可以通过创建对象，通过对象调用action方法

     */

}
