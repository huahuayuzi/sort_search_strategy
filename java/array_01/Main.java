package array_01;

public class Main {
    public static void main(String[] args) {
       Array<Integer> arr = new Array(5);
       for (int i = 0 ; i < 10 ; i++ ){
           arr.addLast(i);
       }
        System.out.println(arr);

        for (int i = 0 ; i < 7; i++ ){
            arr.remove(0);
        }
        System.out.println(arr);
    }
}
