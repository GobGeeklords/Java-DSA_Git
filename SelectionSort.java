import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={5,2,4,3,1};
        int []ans=Sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static void   swap(int[]arr, int first, int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
    public static int[]  Sort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int MaxIndex=Max(arr);
            int last=arr.length-i-1;
            swap(arr,MaxIndex,last);
        }
        return arr;
    }
    public static int Max(int [] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i])
                max=arr[i];
        }
        return max;
    }
}
