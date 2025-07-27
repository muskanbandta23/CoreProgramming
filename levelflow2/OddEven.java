import java .util.*;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if (num < 1) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        }
    }
}
