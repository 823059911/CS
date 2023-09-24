package IntList;
import static org.junit.Assert.*;
import org.junit.Test;
public class MySquarePrimesTest {
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
    }
}
