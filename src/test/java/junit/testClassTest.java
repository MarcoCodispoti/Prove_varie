package junit;

import com.example.prove_varie.Classi.UnitTest.testClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class testClassTest {

    @Test
    public void TestDivisione(){
        testClass TestDivisione = new testClass();
        double output = TestDivisione.divisione(20,5);
        assertEquals((double) 4, output, 0);
    }

}