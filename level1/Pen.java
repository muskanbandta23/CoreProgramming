public class Pen {
    public static void main(String[] args){
        int totalpens = 14;
        int students = 3;
        int perstudents = totalpens/students;
        int remain = totalpens % students;
        System.out.println(perstudents + remain);
    }
}

