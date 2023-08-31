public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={12,13,14,15,16,18,20,30,45};
        int target=14;
        int ans=Search(arr,target);
        System.out.println("The item is found at index :");
        System.out.println(ans);
    }
    static int Search(int[] arr, int target){
        int start =0;
        int end =arr.length-1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (target == arr[mid])
                return mid;
             else if (target > arr[mid])
                start = mid + 1;
                else if (target < arr[mid])
                end = mid - 1;
                else
                return -1;
        }
        return -1;
    }
}
