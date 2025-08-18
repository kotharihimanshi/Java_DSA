import java.util.Arrays;

//Dutch National Flag problem

public class SortColorTest {
    public static void main(String[] args) {
        int[][] testCases = {
            {2,0,2,1,1,0},
            {2,0,1},
            {0},
            {1},
            {2,2,2,1,1,0,0},
            {0,1,2,0,1,2,0,1,2}
        };

        System.out.println("Brute Force:");
        for (int[] test : testCases) {
            int[] arr = test.clone();
            new SolutionBrute().sortColors(arr);
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("\nBetter:");
        for (int[] test : testCases) {
            int[] arr = test.clone();
            new SolutionBetter().sortColors(arr);
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("\nOptimal:");
        for (int[] test : testCases) {
            int[] arr = test.clone();
            new SolutionOptimal().sortColors(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
//brute force
// class SolutionBrute {
//     public void sortColors(int[] nums) {
//         Arrays.sort(nums); 
//     }
// }


//better solution
// class SolutionBetter {
//     public void sortColors(int[] nums) {
//         int count0 = 0, count1 = 0, count2 = 0;
        
//         for (int num : nums) {
//             if (num == 0) count0++;
//             else if (num == 1) count1++;
//             else count2++;
//         }
        
//         int i = 0;
//         while (count0-- > 0) nums[i++] = 0;
//         while (count1-- > 0) nums[i++] = 1;
//         while (count2-- > 0) nums[i++] = 2;
//     }
// }


//optimal solution
class SolutionOptimal {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
