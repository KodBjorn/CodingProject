import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class programTest {

    theCounter count = new theCounter();
    readWrite readWriter = new readWrite();
    @Test
    public void rowTestCase(){

        int expected = 1;

        count.countingRader();

        int actual = count.getRowCount();

        assertEquals(expected,actual);
    }
    @Test
    public void charTestCase (){

        int expected = 5;

        count.countingTecken("Björn");

        int actual = count.getCharCount();

        assertEquals(expected,actual);
    }
    @Test
    public void readTestCase (){

        Boolean expected = false;

        readWriter.setRun(false);

        boolean actual = readWriter.isRun();

        assertEquals(expected,actual);
    }
    @Test
    public void writeTestCase (){
        readWriter.write(4,54);
    }
}
