package Task2;

import java.util.Arrays;

/**
 * Task 2
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * <p>
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * <p>
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */

public class Duplicate {
    public static boolean checkNumberDuplicate(int[] numbersToChecked) {
        Arrays.sort(numbersToChecked);
        for (int i = 0; i < numbersToChecked.length - 1; i++) {
            if (numbersToChecked[i] == numbersToChecked[i + 1]) {
                return true;
            }
        }
        return false;
    }


}
