package java.two_week.animal;

public class Animal {
    String name;
    public Animal(String name){
        this.name=name;
    }
    public void sleep(){
        System.out.println(name+"가 잠을 잔다");
    }
    public void eat(){
        System.out.println(name+"가 밥을 먹다.");
    }
}
