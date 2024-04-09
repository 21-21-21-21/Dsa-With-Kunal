package LinearSearchAlgorithm;

public class FindMin {
    public static void main(String[] args) {
        int nums[] = {12, 4, 6, 7, 1, 21};
        System.out.println(minNumber(nums));
    }
    static int minNumber(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return  min;
    }
}
