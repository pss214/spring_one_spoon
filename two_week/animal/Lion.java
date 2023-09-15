package two_week.animal;

import two_week.animal.Animal;

public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat(){
        System.out.println(name+"가 씹어 먹다");
    }
    public void run(){
        System.out.println(name+"가 달리다");
    }
}
