package java.two_week.animal;

public class Eagle extends Animal {
    public Eagle(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(name +"가 날다");
    }
    @Override
    public void sleep() {
        System.out.println(name+"가 서서 자다");
    }
}
