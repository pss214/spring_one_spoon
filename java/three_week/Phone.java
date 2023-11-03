package java.three_week;

public abstract class Phone {
    public abstract void voice_on();
    public abstract void voice_off();
    public abstract void power_on();
    public abstract void power_off();
    public void message(){
        System.out.println("메세지를 보냈습니다!");
    }
    public void method_all(){
        this.voice_on();
        this.voice_off();
        this.power_on();
        this.power_off();
        this.message();
    }
}
