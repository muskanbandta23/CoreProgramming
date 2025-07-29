import java.util.Scanner;
public class BMIChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people are we checking BMI for? ");
        int totalPeople = scanner.nextInt();

        double[] heights = new double[totalPeople];
        double[] weights = new double[totalPeople];
        double[] bmiValues = new double[totalPeople];
        String[] categories = new String[totalPeople];

        for (int i = 0; i < totalPeople; i++) {
            System.out.println("Person " + (i + 1) + ": enter height in meters, then weight in kg:");
            heights[i] = scanner.nextDouble();
            weights[i] = scanner.nextDouble();
        }

        for (int i = 0; i < totalPeople; i++) {
            double h = heights[i];  // pulled out to make it feel more readable
            double w = weights[i];

            double bmi = w / (h * h);
            bmiValues[i] = bmi;

            if (bmi < 18.5) {
                categories[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                categories[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                categories[i] = "Overweight";
            } else {
                categories[i] = "Obese";
            }
        }

        System.out.println();
        System.out.println("Height\tWeight\tBMI\t\tCategory");
        for (int i = 0; i < totalPeople; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    heights[i], weights[i], bmiValues[i], categories[i]);
        }
    }
}
