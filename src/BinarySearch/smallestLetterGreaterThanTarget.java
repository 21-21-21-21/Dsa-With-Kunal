package BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class smallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char letters[] = {'c', 'f', 'j'};
        char target = 'a';

        System.out.println(nextGreatestLetter(letters, target));
    }
    public  static  char nextGreatestLetter(char[] letters, char target) {

        int low = 0;
        int high =letters.length-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(letters[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return letters[low % letters.length];
    }
}
