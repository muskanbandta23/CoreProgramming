import java.util.Scanner;

public class Studentage {
    public static void main(String[] java){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int [] ages = new int[n];
        // int [] ages = new int [10];

        for(int i = 0 ;i<ages.length;i++){
            ages[i]= scn.nextInt();
        }
        System.out.println("Result");
        for(int i=0;i<ages.length;i++){
            int age = ages[i];
            if(age < 0){
                System.out.println("Student "+ (i+1) + "Invalid Age");
            } else if (age>=18) {
                System.out.println("Student " + (i+1) + "with age " + age + "can vote");
            }
            else {
                System.out.println("Student " + (i + 1) + " with age " + age + " cannot vote.");
            }

        }

        //We use i + 1 to convert computer counting (starting from 0) to human-friendly counting (starting from 1).
        //print array code
//        for(int i = 0; i < ages.length; i++) {
//            System.out.print(ages[i] + " ");
//        }
    }
}
