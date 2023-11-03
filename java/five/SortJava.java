package java.five;

public class SortJava {
    public static void main(String[] args) {
        int len = 10;
        int max = 100;
        int list[] = new int[len];
        for (int i = 0; i<len;i++){
            double Value = Math.random();
            list[i]= (int)(Value *max);
        }
        Sorting s = new Sorting(list);
        s.print();
        s.sort();
        s.print();

    }
}
