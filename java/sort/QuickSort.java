package sort;

//快速排序
public class QuickSort {

    public void move(int [] arr){
        int key = arr[arr.length-1];
        int i = 0 ;
        int j = arr.length -2;
        int index = -1;
        while(i<j){
            if (arr[i] > key && arr[j] < key){//双向的排序
                int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp;
                i++;
                j--;
            }else if(arr[i] > key){
                j--;
            }else if (arr[j] < key){
                i++;
            }
            index = i;

        }
        int temp ;
        temp = key;
        arr[arr.length-1] = arr[index+1];
        arr[index+1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {9,3,4,2,20,87,10};
        new QuickSort().move(arr);
        print(arr);
    }
    public  static  void print(int [] arr){
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i]);
            if (i!=arr.length-1){
                System.out.print(",");
            }
        }
    }
}
