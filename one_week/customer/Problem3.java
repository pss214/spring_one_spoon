package one_week.customer;

import one_week.customer.Customer;
import one_week.customer.VIPCustomer;

public class Problem3 {
    public static void main(String[] args) {
        Customer customer = new Customer("홍길동");
        System.out.println("홍길동"+customer.calcPrice(10000));
        customer.showCustomerInfo();

        VIPCustomer vipCustomer = new VIPCustomer("이순신");
        System.out.println("이순신"+vipCustomer.calcPrice(10000));
        vipCustomer.showCustomerInfo();
    }
}
