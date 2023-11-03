package java.two_week;

public class MyInfoMain {
    public static void main(String[] args) {
        MyInfo myInfo = new MyInfo();
        myInfo.setName("홍길동");
        myInfo.setAge(24);
        myInfo.setStudent_id("20073005");
        System.out.println(myInfo.getName()+myInfo.getAge()+
                myInfo.getSchool_name()+ myInfo.getStudent_id());
        myInfo.printAll();
    }
}
