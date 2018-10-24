import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursionTests {

    public int[] array1;
    public int[] array2;
    public int[] array3;

    @Before
    public void setup() {

        array1 = new int[]{};
        array2 = new int[]{-4};
        array3 = new int[]{3, 0, -4, 8};

    }

    @Test
    public void factorialTest1() {
        assertEquals(1, Recursion.factorial(0));
    }

    @Test
    public void factorialTest2() {
        assertEquals(1, Recursion.factorial(1));
    }

    @Test
    public void factorialTest3() {
        assertEquals(24, Recursion.factorial(4));
    }

    @Test
    public void arraySumTest1() {
        assertEquals(0, Recursion.sumOfArray(array1));
    }

    @Test
    public void arraySumTest2() {
        assertEquals(-4, Recursion.sumOfArray(array2));
    }

    @Test
    public void arraySumTest3() {
        assertEquals(7, Recursion.sumOfArray(array3));
    }

    @Test
    public void recaman1() {
        assertEquals(0, Recursion.recaman(0));
    }

    @Test
    public void recaman2() {
        assertEquals(1, Recursion.recaman(1));
    }

    @Test
    public void recaman3() {
        assertEquals(3, Recursion.recaman(2));
    }

    @Test
    public void recaman4() {
        assertEquals(7, Recursion.recaman(5));
    }

    @Test
    public void mccarthy1() {
        assertEquals(91, Recursion.McCarthy91(101));
    }

    @Test
    public void mccarthy2() {
        assertEquals(105, Recursion.McCarthy91(115));
    }

    @Test
    public void mccarthy3() {
        assertEquals(220, Recursion.McCarthy91(230));
    }

    @Test
    public void mccarthy4() {
        assertEquals(91, Recursion.McCarthy91(0));
    }

    @Test
    public void mccarthy5() {
        assertEquals(91, Recursion.McCarthy91(1));
    }

    @Test
    public void mccarthy6() {
        assertEquals(91, Recursion.McCarthy91(100));
    }

    @Test
    public void mccarthy7() {
        assertEquals(91, Recursion.McCarthy91(91));
    }

    @Test
    public void mccarthy8() {
        assertEquals(91, Recursion.McCarthy91(24));
    }

}
