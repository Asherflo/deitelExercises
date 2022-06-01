package chapterFour;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer;
    Customer aCustomer;
    @BeforeEach
    void setUp() {
        System.out.println("testing testing");
        customer = new Customer();
    }

    @Test
    void testCustomerExist(){
        System.out.println("i am running!");
        assertNotNull(customer);

    }
    @Test
    void testAllArgumentConstructorExist(){
        aCustomer = new Customer("12345", 1000, 550, 12, 400);
        assertEquals(aCustomer.getAccountNumber(), "12345");
    }

    @Test
    void testCalculateCustomerBalance(){
        aCustomer = new Customer("12345", 800, 550, 1200, 400);
        assertEquals(aCustomer.calculateBalance(), 150);
    }
    @Test
    void testDisplayNewBalance(){
        aCustomer = new Customer("12345", 800, 550, 1200, 400);
        assertEquals(aCustomer.calculateBalance(), 150);
        assertEquals(aCustomer.displayNewBalance(), 150);
    }

    @Test
    void testValidateNewBalanceExceedCreditLimit(){
        aCustomer = new Customer("12345", 800, 1550, 1200, 400);
        assertTrue(aCustomer.validateCreditLimitExceeded());
    }


}