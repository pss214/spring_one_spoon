package java.three_week;

public class MainClass {
    public static void main(String[] args) {
        String name;
        name = "홍길동";

        char a = name.charAt(0);
        System.out.println(a=='홍');
        System.out.println(a=='길');
        System.out.println(a=='동');
        System.out.println(name.equals("홍길동"));

        char[] a1 = name.toCharArray();
        System.out.println(a1);
        System.out.println("a1의 길이는 "+a1.length);
        int b = 5;
        System.out.println(b);
    }
}
