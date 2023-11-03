package java.three_week;

public class Calculater implements Calc{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public double mul(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        if(b == 0){
            return -9999999;
        }
        else {
            return a/b;
        }
    }
}
