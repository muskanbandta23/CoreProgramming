public class Feediscount {
    public static void main(String[] args){
        double fee = 125000;
        double  discountPercent = 10;
        double discount = (discountPercent /100) * fee;
        double finalFee = fee - discount;
        System.out.println("The discoumt" + discount + " and final discount " + finalFee);
    }
}
