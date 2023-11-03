package java.three_week;

public interface Calc {
    double PI = 3.14;
    int add(int a, int b);
    int sub(int a, int b);
    double mul(int a, int b);
    int div(int a, int b);
    default void print(){
        System.out.println("정수 계산기를 구현합니다");
        myMethod();
        myStaticMethod();
    }
    private void myMethod(){
        System.out.println("private 메소드입니다.");
    }
    private static void myStaticMethod(){
        System.out.println("private static 메서드입니다");
    }
    static int total(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }
}
