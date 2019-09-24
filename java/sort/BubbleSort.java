package sort;

//冒泡排序
/*
      每次比较相邻的两个元素，如果前一个元素大于后面一个元素，就交换位置
      每次都把最大的一个上浮到数组最后
      是稳定排序
 */
public class BubbleSort {
    public void sort(int[] arr){
        for (int i = 0 ; i < arr.length - 1 ; i ++){
            for (int j = 0 ; j < arr.length-1-i ; j++){
                if (arr[i]>arr[i+1]){
                    int temp ;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    //冒泡排序优化方式
    public void sort2(int[] arr){
        for (int i = 0 ; i < arr.length - 1 ; i ++){
            boolean flag = false;//默认没有交换
            for (int j = 0 ; j < arr.length-1-i ; j++){
                if (arr[i]>arr[i+1]){
                    int temp ;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;//交换
                }
            }
            if (!flag)break;//如果没有发生交换，说明已经是有序的，可以马上停止交换
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{18,3,5,10,24,87};
        new BubbleSort().sort(arr);
        for (int i= 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

}
