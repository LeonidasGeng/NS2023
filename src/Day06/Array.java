package Day06;

/*
数组的使用演示类
 */
public class Array {
    public static void main(String[] args) {
        //1, 数组的定义（声明）
        int[] a;
        //2, 数组的初始化
        //数组静态初始化的方式
        //1，已知存储个数和存储内容
        //数组b中有1，2，3三个元素
        //数组c中有10，20，30三个元素
        int[] b = {1, 2, 3};
        int[] c = {10, 20, 30};
        //2，只知道存储个数
        //创建一个可以储存3个数据的数组
        int[] d = new int[4];
        //没有赋值的话，默认都是0
        //给d中的位置赋值
        d[0] = 12;
        d[1] = 15;
        d[2] = 22;
        //3，数组的访问（获取数组中的元素）
        //位置 0,1,2,3……
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d[3]);//没有赋值的话，默认值是0



        //一次性打印数组中的全部/部分数据
        //loop
        //打印特定数量的值,直接写想print的数量的值
        //如果想打印整个数组 length.使用方法:    数组名.length        例子a.length   e.length
        int[] e ={1,22,3,43,5,64,6,3,434,23,432,4,324,234,23,4,234};
        for(int i =0;i<10;i++){
            System.out.println(e[i]);
        }
        for(int i =0;i< e.length;i++){
            System.out.println(e[i]);
        }
    }
}
