package java.three_week;

public class CalcMain {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Calculater calc = new Calculater();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.sub(num1,num2));
        System.out.println(calc.mul(num1,num2));
        System.out.println(calc.div(num1,num2));
        calc.print();

        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));
    }
}
