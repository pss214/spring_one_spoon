package one_week;

public class ObjectEx1 {
    String name;
    int age;
    String student_id;
    public void print(){
        System.out.println("내 이름은 "+ name + "이고, 나이는 "+age+"이고, 학번은 "+ student_id+"야 만나서 반가워~");
    }

    public static void main(String[] args) {
        ObjectEx1 objectEx1 = new ObjectEx1();
        objectEx1.name="홍길동";
        objectEx1.age = 25;
        objectEx1.student_id = "10000001";
        objectEx1.print();
    }
}
