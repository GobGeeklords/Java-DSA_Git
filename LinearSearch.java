public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 78, 76, 232, 123, 543, 12334, 543624, 124134};
        int target = 1;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}

