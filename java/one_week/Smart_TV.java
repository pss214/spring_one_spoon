package java.one_week;

public class Smart_TV {
    private String brand;
    private int price;
    private int inch;
    public Smart_TV(String brand, int price, int inch){
        this.brand = brand;
        this.price = price;
        this.inch = inch;
    }

    public Smart_TV() {}

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
    public void print(){
        System.out.println("브랜드 : "+brand+" | 가격 : "+price+"원 | 인치 : "+inch);
    }
}
