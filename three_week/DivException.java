package three_week;

public class DivException {
    public static void main(String[] args) {
        System.out.println(1/0);
        try {
            System.out.println(1/0);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("0으로 나눌 수 없습니다!");
        }

    }
}
