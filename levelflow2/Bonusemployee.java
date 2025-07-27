import java.util.Scanner;
public class Bonusemployee {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int year = scn .nextInt();
        int salary = scn.nextInt();
        double bonus =0;
        if(year > 5){
            bonus = salary * 0.05;  // 5% bonus
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus. Less than 5 years of service.");
        }
    }
}
