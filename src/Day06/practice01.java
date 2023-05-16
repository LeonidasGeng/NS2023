package Day06;

/*
    写一个程序，求出数组中每个元素相加的和

 */
public class practice01 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,4,4,4,55,3};
        int total = 0;
        for(int i =0; i<arr.length;i++){
            total +=arr[i];
        }
        System.out.println("arr数组的总和为: "+total);

        int[] arr1 ={1,2,3,42,4,4,4,55,3};
        total = 0;
        for(int i =0; i<arr1.length;i++){
            total +=arr1[i];
        }
        System.out.println("arr数组的总和为: "+total);

        int[] arr2 ={1,2,3,4,4,41,4,55,3};
        total = 0;
        for(int i =0; i<arr2.length;i++){
            total +=arr2[i];
        }
        System.out.println("arr数组的总和为: "+total);
    }

    Array getArrayTotal(ar){

    }
}
