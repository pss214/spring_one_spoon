package three_week;

public class SamsungPhone extends Phone{
    @Override
    public void voice_on() {
        System.out.println("삼성휴대폰 - 전화 받음");
    }

    @Override
    public void voice_off() {
        System.out.println("삼성휴대폰 - 전화 끊음");
    }

    @Override
    public void power_on() {
        System.out.println("삼성휴대폰 - 전원 켜기");
    }

    @Override
    public void power_off() {
        System.out.println("삼성휴대폰 - 전원 끄기");
    }
}
