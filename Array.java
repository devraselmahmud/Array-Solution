import java.util.*;

class Array {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 4, 3};
        Arrays.sort(arr);
        System.out.println("Min: "+arr[0]+" & Max: "+arr[arr.length-1]);
    }
}