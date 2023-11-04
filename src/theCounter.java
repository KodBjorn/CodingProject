
public class theCounter {

    public static int rowCount = 0;
    public static int charCount = 0;
    public theCounter() {
    }

    public static int getRowCount() {

        return rowCount;
    }

    public static int getCharCount() {

        return charCount;
    }

    public void countingRader (){

        rowCount++;
    }
    public void countingTecken (String text){

        charCount = charCount + text.replaceAll("\\s+", "").length();
    }
}


