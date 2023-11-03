package java.four_java;

import java.util.Objects;

import static java.four_java.BankMain.list;

public class Bank {
    private String name;
    private String account_num;
    private int money;

    public String getAccount_num() {
        return account_num;
    }

    public Bank(String name, String account_num){
        this.name = name;
        this.account_num=account_num;
        this.money = 0;
    }
    public void deposit(int amount){
        money+=amount;
        System.out.println(name+"님 "+amount+"원 입금 완료되었습니다. 잔액은 "+money+"원 입니다");
    }
    public void withdraw(int amount){
        if(money>=amount)
        {
            money-=amount;
            System.out.println(name+"님 "+amount+"원 출금 완료되었습니다. 잔액은 "+money+"원 입니다");
        }else {
            System.out.println("출금 할 수 없습니다. 금액을 다시 확인해 주세요.");
        }
    }
    public void remittance(String num,int amount){
        if(Objects.equals(num, account_num)){
            System.out.println("입금 서비스를 이용해주세요");
        }
        if(money>=amount){
            for (Bank a: list) {
                if(Objects.equals(a.account_num, num)){
                    a.money+=amount;
                    System.out.println(a.name+"님에게 "+amount+"원을 송금했습니다.");
                }
            }
            System.out.println("수신자를 찾을 수 없습니다");
        }else {
            System.out.println("송금 할 수 없습니다. 금액을 다시 확인해 주세요.");
        }
    }
    public void balance(){
        System.out.println(name+"님의 통장 잔고 금액은 "+money+"원 입니다");
    }
}
