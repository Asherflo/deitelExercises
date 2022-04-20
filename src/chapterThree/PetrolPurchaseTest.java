package chapterThree;

public class PetrolPurchaseTest {
    public static void main(String[] args) {
        PetrolPurchase dallasPetrolStationRecord = new PetrolPurchase("DallasStation","kerosine",500,150.00,20.50,350.00);
        //dallasPetrolStationRecord .setQuantity(24);


        System.out.println("The name of the petrol station is: "+ dallasPetrolStationRecord.getName());
        System.out.println("The name of the  type petrol  is: "+ dallasPetrolStationRecord.getType());
        System.out.println("The name of the petrol quantity is: "+ dallasPetrolStationRecord.getQuantity());
        System.out.println("The name of the petrol price is: "+ dallasPetrolStationRecord.getPrice());
        System.out.println("The name of the petrol  discounted price is: "+ dallasPetrolStationRecord.getDiscount());
        System.out.println("The name of the purchase amountis: "+ dallasPetrolStationRecord.getPurchaseAmount());

    }
}
