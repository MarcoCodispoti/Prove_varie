package junit;

import com.example.prove_varie.Classi.UnitTest.testClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class testClassTest {

    @Test
    public void TestSomma(){
        testClass TestSomma = new testClass();
        double output = TestSomma.Somma(20,5);
        assertEquals( (int)25,output,0);
    }


    @Test
    public void TestDivisione(){
        testClass TestDivisione = new testClass();
        double output = TestDivisione.Divisione(20,5);
        assertEquals((double) 4, output, 0);
    }

}