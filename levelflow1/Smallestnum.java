import java.util.Scanner;
import java.util.*;
public class Smallestnum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        if(num1 < num2){
            System.out.println("Yes " + num1 + " is smallest");
        } else if (num1 < num3) {
            System.out.println("Yes " + num1 + " is smallest");
        }
        else{
            System.out.println("NO " + num1 + " is not the smallest");
        }
    }
}
