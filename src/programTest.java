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
    public void runTestCase (){

        Boolean expected = false;

        readWriter.setRun(false);

        boolean actual = readWriter.isRun();

        assertEquals(expected,actual);
    }
    @Test
    public void writeTestCase (){
        readWriter.write(4,54);
    }
    @Test
    public void wordCountTestCase (){

        int expected = 4;

        count.countLongestWordChar("Longest Word Out There");

        int actual = count.getWordCount();

        assertEquals(expected,actual);
    }
    @Test
    public void longestWordTestCase (){

        String expected = "Longest";

        count.countLongestWordChar("Longest Word Out There");

        String actual = count.getLongestWord();

        assertEquals(expected,actual);
    }
    @Test
    public void newRunTestCase(){

        boolean expected = false;

        count.countLongestWordChar("stop");

        boolean actual = count.isRunning();

        assertEquals(expected,actual);
    }
}
