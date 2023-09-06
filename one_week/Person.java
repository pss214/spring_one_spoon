package one_week;

public class Person {
    String name;
    int height;
    int weight;
    public Person(){
        this("홍길동");
    }
    public Person(String name){
        this(name, 0, 0);
    }
    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public void print(){
        System.out.println("이름 : "+name+",키 : "+height+",몸무게 : "+ weight);
    }
}
