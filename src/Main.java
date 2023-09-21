import Task1.PalindromeChecker;
import Task2.Duplicate;
import Task3.Sum;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        String string = "A man, a plan, a canal, Panama";
        System.out.println(PalindromeChecker.isPalindrome(string));

        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers1 = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Duplicate.checkNumberDuplicate(numbers));
        System.out.println(Duplicate.checkNumberDuplicate(numbers1));

        int[] num = {1, 2, 3, 4};
        int target = 4;

        System.out.println(Arrays.toString(Sum.findIndexTwoSumNumber(num, target)));

    }


}