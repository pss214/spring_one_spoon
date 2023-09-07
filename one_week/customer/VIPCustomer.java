package one_week.customer;

import one_week.customer.Customer;

public class VIPCustomer extends Customer {
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private int bonusRatio;
    private int selesRatio;
    public VIPCustomer(String customerName){
        this.customerName=customerName;
        this.customerGrade="VIP";
        this.bonusRatio=10;
        this.selesRatio=10;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio/100;
        return price * selesRatio/100;
    }
    public void showCustomerInfo(){
        System.out.println(customerName+"고객님의 현재 등급은 "+customerGrade+"이고, 모으신 포인트는 총"+ bonusPoint+"입니다.");
    }
}
