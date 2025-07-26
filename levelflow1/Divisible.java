import java.util.*;

public class Divisible {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if(num % 5 == 0){
            System.out.print("Yes, the " + num + " is divisible by 5");
        } else {
            System.out.print("No, the " + num + " is not divisible by 5");
        }
        scn.close();
    }
}
