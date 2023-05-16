package Day06;

/*
    写一个程序，求出数组中每个元素相加的和

 */
public class practice01 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,4,4,4,55,3};
        int total = getArrayTotal(arr);
//        int total = 0;
//        for(int i =0; i<arr.length;i++){
//            total +=arr[i];
//        }
        System.out.println("arr数组的总和为: "+total);

        int[] arr1 ={1,2,3,42,4,4,4,55,3};
        int total1 = getArrayTotal(arr1);
        //        total = 0;
//        for(int i =0; i<arr1.length;i++){
//            total +=arr1[i];
//        }
        System.out.println("arr数组的总和为: "+total1);

        int[] arr2 ={1,2,3,4,4,41,4,55,3};
        int total2 = getArrayTotal(arr2);
//        total = 0;
//        for(int i =0; i<arr2.length;i++){
//            total +=arr2[i];
//        }
        System.out.println("arr数组的总和为: "+total2);
    }

    //只有数组不一样，但逻辑是一样的
    //不知道，有没有参数，要不要返回值，先用void
    //1,推导：哪些地方参与循环？复制进{}
    //2,修改：修改报错的地方
    //3,不能写死的东西当成参数放到()
    //4,修改返回值类型, 有返回值，循环后加total
    static int getArrayTotal(int[] arr){
    //void
        //不能写死的东西当成参数放到()
        //int[] arr ={1,2,3,4,4,4,4,55,3};
        int total = 0;
        for(int i =0; i<arr.length;i++){
            total +=arr[i];
        }
        return total;
    }
}
