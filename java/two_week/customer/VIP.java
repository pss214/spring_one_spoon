package java.two_week.customer;

public class VIP extends GOLD{

    public VIP(String customerName) {
        super(customerName);
        super.setBonusRatio(20);
        super.setCustomerGrade("VIP");
    }
    public void agent(){
        System.out.println("안녕하십니까 "+super.getCustomerName() +" 고객님, 무엇을 도와드릴까요?");
    }
}
