package sort;

//插入排序
public class InsertionSort {
    //优化插入排序
    public void sort(int[] arr){
        for (int i = 1 ; i < arr.length ; i ++){
            int cur = arr[i];
            int preIndex = i -1;
            for (int j = i-1 ; j >= 0 ; j--){
                if (cur<arr[j]){
                   arr[preIndex+1] = arr[preIndex];
                   preIndex--;
                }
            }
            arr[preIndex+1] = cur;
        }
    }
    //普通插入排序
    public void sort2(int[] arr){
        int temp ;
        for (int i = 1 ; i < arr.length ; i ++){
            for (int j = i ; j > 0 ; j--){
                if (arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {90,34,100,34,37,68,23,59};
        new InsertionSort().sort2(arr);
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.println(arr[i]);
        }
    }
}
