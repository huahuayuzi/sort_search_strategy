package sort;

//选择排序
/*
每次选择未排序的元素中找出最小的，放在有序序列中
是稳定排序
 */
public class SelectionSort {
    public void sort(int[] arr){
        for (int i = 0 ; i < arr.length-1 ; i++){
            int min = i;
            for (int j = i+1 ; j < arr.length ; j ++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            if (min!=i){
                int temp;
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int [] arr = {90,34,100,34,37,68,23,59};
        new SelectionSort().sort(arr);
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.println(arr[i]);
        }
    }
}
