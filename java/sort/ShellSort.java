package sort;


//希尔排序，基于插入排序
public class ShellSort {
    public void sort(int[] arr){
        int h = 1;
        while (h <= arr.length / 3){
            h = h*3 +1;//knuth最好的时间复杂度
        }
        for (int gap = h ; gap >0 ; gap = (gap-1)/3){
            for (int i = gap ; i < arr.length ; i++){
                for(int j = i  ; j > gap -1 ; j -= gap){
                    if (arr[j]<arr[j-gap]){//简单插入排序算法
                        int temp;
                        temp = arr[j];
                        arr[j] = arr[j-gap];
                        arr[j-gap] = temp;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int [] arr = new int[]{9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};
        new ShellSort().sort(arr);
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i]+",");
    }
    }
}
