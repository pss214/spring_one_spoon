package java.one_week;

public class Problem2 {
    public static void main(String[] args) {
        Smart_TV smartTv1 = new Smart_TV("LG",900000,40);
        smartTv1.print();
        Smart_TV smartTv2 = new Smart_TV();
        smartTv2.setBrand("SAMSUNG");
        smartTv2.setPrice(1100000);
        smartTv2.setInch(70);
        smartTv2.print();
    }


}
