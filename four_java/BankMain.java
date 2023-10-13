package four_java;

import java.util.ArrayList;
import java.util.List;

public class BankMain {
    public static List<Bank> list = new ArrayList<Bank>();
    public static void main(String[] args){
        Bank person1 = new Bank("김철수","1");
        list.add(person1);
        Bank person2 = new Bank("홍길동", "2");
        list.add(person2);
        person1.deposit(10000);
        person1.withdraw(10001);
        person1.withdraw(10000);
        person1.remittance("1",10000);
        person1.remittance("2",10000);
        person1.deposit(10000);
        person1.remittance("2",10000);
        person1.balance();
    }
}
