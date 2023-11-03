package java.one_week.customer;

public class Customer {
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private int bonusRatio;
    public Customer(String customerName){
        this.customerName=customerName;
        this.customerGrade="SILVER";
        this.bonusRatio=1;
    }

    public Customer() {
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio/100;
        return price;
    }
    public void showCustomerInfo(){
        System.out.println(customerName+"고객님의 현재 등급은 "+customerGrade+"이고, 모으신 포인트는 총"+ bonusPoint+"입니다.");
    }
}
