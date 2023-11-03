package java.two_week.customer;

public class CustomerMain {
    public static void main(String[] args) {
        SILVER silver = new SILVER("철수");
        GOLD gold = new GOLD("민수");
        VIP vip = new VIP("길동");
        System.out.println(silver.Price(10000));
        System.out.println(gold.Price(10000));
        System.out.println(vip.Price(10000));
        System.out.println("============");
        silver.showCustomerInfo();
        gold.showCustomerInfo();
        vip.showCustomerInfo();
        System.out.println("============");
        vip.agent();
    }
}
