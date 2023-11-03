package java.two_week.customer;

public class GOLD extends SILVER {
    private int salesRatio;

    public GOLD(String customerName) {
        super(customerName);
        super.setBonusRatio(15);
        super.setCustomerGrade("GOLD");
    }
}
