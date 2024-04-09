package LinearSearchAlgorithm;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Debu";
        char target = 'u';
//        System.out.println(Search2(str, target));

        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean Search(String str, char target){
        if(str.length() == 0 || str == null){
            return false;
        }
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    static boolean Search2(String str, char target){
        if(str.length() == 0)return false;
        for(char ch:str.toCharArray()){
            if(ch == target){
                return  true;
            }
        }
        return  false;
    }
}
