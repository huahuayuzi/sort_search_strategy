package LinkAndRecursion_04;

//             ===01===计算所有元素的和
public class Sum {
    public static int sum (int[] arr){
        return sum(arr,0);
    }
    //计算arr[l..n]这个区间内所有数字的和
    private static  int sum(int[]arr,int l){
       if (l == arr.length){
           return 0;
       }
        return sum(arr,l+1)+arr[l];
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(sum(arr));
    }
}
