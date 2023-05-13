package Day05;
/*
一个篮球从100米高空落下，每次弹起告诉是原来的一半
问：1，总共弹起多少次？（最小弹跳高度0.01)
    2，总共经过多少米？

 */
public class Assignment2 {
    public static void main(String[] args) {
        double height = 100;
        double distance = height;
        int count = 0;
        while(height/2>=0.01){
            distance += height;
            height /= 2;
            count +=1;
        }
        System.out.println("总共弹了: " + count +"次");
        System.out.println("总共弹了: " + distance +"米");
    }
}
