import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int [] arr = new int[10];
        //store rsul tin array
        for(int i=0;i<arr.length;i++){
            arr[i]= num*(i+1);
        }
        for(int i=1;i<=10;i++){
            System.out.println(num + " * " + (i+1)  + " = " + arr[i]);
        }
    }
}
