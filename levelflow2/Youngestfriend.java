import java.util.Scanner;

public class Youngestfriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageAmar = sc.nextInt();
        int heightAmar = sc.nextInt();


        int ageAkbar = sc.nextInt();
        int heightAkbar = sc.nextInt();

        int ageAnthony = sc.nextInt();
        int heightAnthony = sc.nextInt();

        //youngest
        String youngest = "";
        int minAge = ageAmar;

        if(ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        } else {
            youngest = "Amar";
        }

        if(ageAnthony < minAge) {
            minAge = ageAnthony;
            youngest = "Anthony";
        }

        // the tallest
        String tallest = "";
        int maxHeight = heightAmar;

        if(heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        } else {
            tallest = "Amar";
        }

        if(heightAnthony > maxHeight) {
            maxHeight = heightAnthony;
            tallest = "Anthony";
        }
        System.out.println("The youngest friend is: " + youngest + " (Age: " + minAge + ")");
        System.out.println("The tallest friend is: " + tallest + " (Height: " + maxHeight + " cm)");
    }
}
