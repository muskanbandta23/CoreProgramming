public class Earthvol {
    public static void main (String [] args){
        double radiuskm = 6378;
        double volumekm3 = (4.0 /3) * Math.PI *Math.pow(radiuskm,3);
        double volumeMiles3 = volumekm3 / Math.pow(1.6,3);
        System.out.print("The Volume of earthh in cubic kilometers is "+ volumeMiles3 + " and cubic miles" + volumeMiles3);
    }
}
