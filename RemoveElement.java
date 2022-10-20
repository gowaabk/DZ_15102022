package DZ_15102022;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        removeElements(nums, val);
    }

    public static int removeElements(int[] nums, int val) {
        int index = 0;
        int j = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        while (j-- > index) {
            nums[j] = 0;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(index);
        return index;

    }
}
