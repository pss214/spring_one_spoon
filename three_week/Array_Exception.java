package three_week;

public class Array_Exception {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        try {
            for(int i = 0; i<=5; i++){
                System.out.println(a[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("a의 배열 이상으로 호출 하였습니다!");
        }
    }
}
