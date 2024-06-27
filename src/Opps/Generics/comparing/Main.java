package Opps.Generics.comparing;

public class Main {

    public static void main(String[] args) {
        Student debu = new Student(21, 81.99f);
        Student ms = new Student(7, 91.99f);

        if(debu.compareTo(ms) < 0){
            System.out.println(debu.compareTo(ms));
            System.out.println("Ms got more marks..");
        }
    }
}
