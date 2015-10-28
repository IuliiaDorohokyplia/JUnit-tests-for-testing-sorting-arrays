import static org.junit.Test.*;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestSortMetods {
    Mas operacionTest=new Mas();
    int[] arrayNormal = new int[]{0,-5,5,0,-2,0};
    int[] arrayNormalExpected = new int[]{-5,-2,0,0,0,5};

    int[] arrayRegulated = new int[]{15, 10, 9, 0, -1, -6};
    int[] arrayRegulatedExpected = new int[]{-6,-1,0,9,10,15};

    int[] arrayZiro = new int[]{0,0,0,0,0,0,0};
    int[] arrayZiroExpected = new int[]{0,0,0,0,0,0,0};

    int[] arrayAllNegativ = new int[]{-5,-7,-2,-10,-35,-4,-9};
    int[] arrayAllNegativExpected = new int[]{-35,-10,-9,-7,-5,-4,-2};



    @Test
    public void testsortBubble() {
        assertArrayEquals(arrayNormalExpected, operacionTest.sortBubble(arrayNormal));
        assertArrayEquals(arrayRegulatedExpected, operacionTest.sortBubble(arrayRegulated));
        assertArrayEquals(arrayZiroExpected, operacionTest.sortBubble(arrayZiro));
        assertArrayEquals(arrayAllNegativExpected, operacionTest.sortBubble(arrayAllNegativ));
    }
    @Test
    public void testShakerSort() {
        assertArrayEquals(arrayNormalExpected, operacionTest.ShakerSort(arrayNormal));
        assertArrayEquals(arrayRegulatedExpected, operacionTest.ShakerSort(arrayRegulated));
        assertArrayEquals(arrayZiroExpected, operacionTest.ShakerSort(arrayZiro));
        assertArrayEquals(arrayAllNegativExpected, operacionTest.ShakerSort(arrayAllNegativ));
    }


}
