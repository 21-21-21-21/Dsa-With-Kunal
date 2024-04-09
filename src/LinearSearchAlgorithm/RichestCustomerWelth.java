package LinearSearchAlgorithm;

//LeetCode: https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWelth {
    public static void main(String[] args) {
        int account[][] = {
                {1,5},
                {7,3},
                {3, 5}
        };
        System.out.println(maximumWealth(account));
    }
    static  int maximumWealth(int[][] accounts) {

        int maxWelth = Integer.MIN_VALUE;
        for(int i = 0;i<accounts.length;i++){
            int currW = 0;
            for(int j = 0;j<accounts[i].length;j++){
                currW+= accounts[i][j];
            }
            maxWelth = Math.max(maxWelth,currW );
        }
        return maxWelth;
    }
}
