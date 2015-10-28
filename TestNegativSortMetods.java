import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.Test.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.*;

import java.util.InputMismatchException;

import com.sun.tools.internal.ws.wsdl.document.jaxws.*;
import junit.framework.Assert;
import org.junit.Test;

public class TestNegativSortMetods {
    Mas operacionTestNegativ=new Mas();

    int[] arrayNull = new int[]{};
    int[] arrayNullExpected = new int[]{};

    @Test
    public void testsortBubble() {
        assertArrayEquals(arrayNullExpected, operacionTestNegativ.sortBubble(arrayNull));
    }


}
