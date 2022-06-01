package chapterThree;

public class Car {
    private  String model;
    private String year;
    private int price;;

    public Car(String model, String year, int price  ) {
        this.model = model;
        this.year = year;
        this.price = price;


    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public  void setYear(String year){
        this.year = year;
    }
    public  String getYear(){
        return year;
    }


    public  void setPrice(int discountedPrice){
        price = price - (discountedPrice/100);
        if(price < 0){
            this.price = 0;
        }
            else{

                 price =discountedPrice;
        }
    }
    public int getPrice(int discount){
        price = price - (discount);
        return price;
    }


//    }

}
