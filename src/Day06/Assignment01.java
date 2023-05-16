package Day06;
/*
1,声明一个数组，储存10，20，30，40，50，60这几个数据
2,编写一个程序，求出上述数组中的最大值
提示:
    假设数组第一个元素是最大值，依次与后面的元素做比较

 */
public class Assignment01 {
    public static void main(String[] args) {
        int[] arr ={1,666,3,43,5,64,6,3,666,23,432,4,324,234,23,4,234};
        int max = arr[0];
        for (int i = 1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("arr数组最大值是"+max);
    }
}
