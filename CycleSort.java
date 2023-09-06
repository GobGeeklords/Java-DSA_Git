import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[]arr={3,5,2,1,4,6,9,7,8};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] Sort(int[] arr){
        int i=0;
        while (i<arr.length){
            int current=arr[i]-1;
            if (arr[current]!=arr[i]) {
                swap(arr, i, current);
            }
            else{
                i++;
                }
        }
        return arr;
    }
    public static void swap(int [] arr, int first, int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
