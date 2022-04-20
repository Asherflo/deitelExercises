package tddClass;

import chapterThree.PetrolPurchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class PetrolPurchaseTDDTest {
    PetrolPurchase dallasPetrolStationRecord;
    @BeforeEach
    public void startWith(){
        dallasPetrolStationRecord =new PetrolPurchase ("DallasStation","kerosine",500,150.00,20.50,350.00);
    }


    @Test
    public void stationNameLocation(){
        //PetrolPurchase.setName("DallasStation");
        assertEquals( "DallasStation",dallasPetrolStationRecord.getName());
    }
    @Test
    public void typeOfPetrol(){
        assertEquals("kerosine",dallasPetrolStationRecord.getType());
    }
    @Test
    public void quantityOfPetrol(){
        assertEquals(500,dallasPetrolStationRecord.getQuantity());
    }
    @Test
    public void PriceOfPetrol(){
        assertEquals(150.00,dallasPetrolStationRecord.getPrice());
    }
    @Test
    public void discountedPriceOfPetrol(){
        assertEquals(20.50,dallasPetrolStationRecord.getDiscount());
    }
    @Test
    public void purchaseAmount(){
        assertEquals(350.00,dallasPetrolStationRecord.getPurchaseAmount());
    }

}
