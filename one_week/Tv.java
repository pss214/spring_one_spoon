package one_week;

public class Tv {
    int volume = 10;
    boolean status;
    void up(){
        volume++;
        System.out.println("볼륨 : "+volume);
    }
    void down(){
        volume--;
        System.out.println("볼륨 : "+volume);
    }
    void button(){
        status = !status;
        if (status){
            System.out.println("TV 켜기");
        }else {
            System.out.println("TV 끄기");
        }

    }
    void all_status(){
        System.out.println("볼륨 : "+volume+" / 전원 : "+status);
    }


}
