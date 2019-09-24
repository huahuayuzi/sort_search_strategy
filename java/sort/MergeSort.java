package sort;
//归并排序   不稳定排序
public class MergeSort {
    public static void sort(int[] arr , int left , int right){
        if (left == right)return;;
        //分成两半
        int mid = left + (right-left)/2;
        //左边排序
        sort(arr,left,mid);
        //右边排序
        sort(arr,mid+1,right);
        merge(arr,left,mid+1,right);
    }
    public static void merge(int[] arr, int leftPtr ,int rightPtr,int rightBound){
        int mid = rightPtr - 1 ;
        int[] temp = new int[rightBound - leftPtr +1];

        int i = leftPtr;
        int j = rightPtr;
        int k = 0 ;
        while(i <= mid && j <= rightBound){
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid)temp[k++] = arr[i++];//有一个没有全部插入
        while (j <= rightBound) temp[k++] = arr[j++];

        for (int m = 0 ; m < temp.length ; m++){
            arr[leftPtr+m] = temp[m];
        }
    }

    public static void main(String[] args) {
        int[] arr = {34,45,23,56,23,651,345,86};
        new MergeSort().sort(arr,0,arr.length-1);
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);;
        }
    }
}
