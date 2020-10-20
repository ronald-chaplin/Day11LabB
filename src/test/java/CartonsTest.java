import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartonsTest {
    Cartons carton;

    @BeforeEach
    void init(){
        carton = new Cartons();
    }

    @Test
    void getBarsTest(){
        carton = new Cartons(5000);
        int expected = 5000;
        int actual = carton.getBars();
        assertEquals(expected, actual);
    }

    @Test
    void setBarsTest() {
        int expected = 400;
        carton.setBars(400);
        int actual = carton.getBars();
        assertEquals(expected, actual, "Expected amount is 400" );
    }

    @Test
    void getCartonsTest(){
        carton.setBars(400);
        carton.setCartons(carton.getBars());
        int expected =16;
        int actual = carton.getCartons();
        assertEquals(expected, actual, "This should be 16.");
    }

    @Test
    void setCartonsTest(){
        carton.setBars(240);
        carton.setCartons(carton.getBars());
        int expected = 10;
        int actual = carton.getCartons();
        assertEquals(expected, actual, "This should be 10.");
    }

    void toStringTest(){
        carton = new Cartons(5000);
        String expected = "208 carton(s) needed to package 5000 bar(S).";
        String actual = carton.toString();
        assertEquals(expected, actual);
    }


}
