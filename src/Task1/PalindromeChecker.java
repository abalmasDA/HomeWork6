package Task1;

/**
 * task 1
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
 * all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * <p>
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * <p>
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * <p>
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 */

public class PalindromeChecker {

    public static boolean isPalindrome(String stringToBeChecked) {
        String stringWithoutNonAlphanumericChar = stringToBeChecked.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = stringWithoutNonAlphanumericChar.length() -1;
        for (int i = 0; i < stringWithoutNonAlphanumericChar.length() -1 ; i++) {
            if (stringWithoutNonAlphanumericChar.charAt(i) != stringWithoutNonAlphanumericChar.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }


}
