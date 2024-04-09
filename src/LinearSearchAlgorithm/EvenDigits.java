package LinearSearchAlgorithm;

//LeetCode: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(countDigits2(nums[i])%2 == 0){
                count++;
            }
        }
        return count;
    }

    static int countDigits2(int n){
        return (int)(Math.log10(n))+1;
    }

}
