import java.util.Arrays;

public class bubbleSort {
    static public void main(String[] args) {
        int [] arr={5,-23,-1,0,2,4};
        int[] ans=BubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] BubbleSort(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            boolean swapped= false;
            for(int j=1;j<nums.length-i;j++){
                if (nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }
            }
            if (!swapped)
                break;
        }
        return nums;
    }
}
