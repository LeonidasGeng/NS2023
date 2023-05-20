package cn.tedu.submarine;

public class MineSubmarine {
    //属性
    int x;
    int y;
    int width;
    int height;
    int speed;

    public MineSubmarine() {
        width = 63;
        height = 19;
        x = -width;
        y = (int) (Math.random() * (479 - height - 150) + 150);
        speed = (int) (Math.random() * (3 - 1) + 1);
    }

    //行为
    void move() { //移动的行为

    }
}
