package five;

public class Sorting {
    private int[] sortlist;
    public Sorting(int[] sortlist){
        this.sortlist=sortlist;
    }
    public void sort(){
        System.out.println("정렬 중입니다...");
        int tmp;
        for (int i=0; i<sortlist.length;i++){
            for (int j=0; j<i;j++) {
                if (sortlist[i] < sortlist[j]) {
                    tmp = sortlist[j];
                    sortlist[j] = sortlist[i];
                    sortlist[i] = tmp;
                }
            }
        }
        System.out.println("정렬 되었습니다!");
    }
    public void print(){
        for(int i=0; i<sortlist.length; i++){
            System.out.print(sortlist[i]+" ");
        }
    }
}
