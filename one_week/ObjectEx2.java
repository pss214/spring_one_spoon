package one_week;

public class ObjectEx2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.print();

        Person person2 = new Person("손흥민");
        person2.print();

        Person person3 = new Person("김연아",164,50);
        person3.print();
    }
}
