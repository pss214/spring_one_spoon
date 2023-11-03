package java.two_week.customer;

public class SILVER {
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private int bonusRatio;

    public String getCustomerName() {
        return customerName;
    }

    public SILVER(String customerName){
        bonusRatio = 10;
        customerGrade = "SILVER";
        this.customerName=customerName;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public void setBonusRatio(int bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

    public int Price(int price){
        bonusPoint += price * bonusRatio/100;
        return price;
    }
    public void showCustomerInfo(){
        System.out.println(customerName+"고객님의 현재 등급은 "+customerGrade+"이고, 모으신 포인트는 총"+ bonusPoint+"입니다.");
    }
}
