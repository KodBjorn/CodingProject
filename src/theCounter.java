
public class theCounter {

    public static int rowCount;
    public static int charCount;
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


