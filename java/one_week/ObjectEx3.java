package java.one_week;

public class ObjectEx3 {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "홍길동"; 접근 제어자로 인해 오류
        student.setName("홍길동");
        System.out.println(student.getName());

        student.setAge(23);
        System.out.println(student.getAge());

        student.setStudent_id("10000001");
        System.out.println(student.getStudent_id());

        System.out.println(student);
    }
}
