package Arrays;

public class Main {
    public static void main(String[] args) {
        //Q : Store a roll number.
        int rollNum = 21;

        //Q : Store a name .
        String name = "Debu";
        System.out.println(name);
        //Q : Store 5 roll number.
        int roll1 = 2;
        int roll2 = 33;
        int roll3 = 88;
        int roll4 = 99;
        int roll5 = 63;

        // What happen if i store 5000 roll number should create each varriable and intilize one by one.
        //at that time we Introduce ->  "Arrays"

        //Syntax -> datatype[] variable_name = new datatype[size];

        int [] studentInfo = new int[5];
        //initialize
        //studentInfo[0] = 31;

        //or directly.
        int [] stInfo = {11,32,55,6};


        int arr[]; //declaration of an array, tha array is getting define in Stack.
        arr = new int[5]; // initialization : actually here the object is being created in heap Memory.

    }
}
