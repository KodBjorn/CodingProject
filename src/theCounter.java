
public class theCounter {

    public static int rowCount;
    public static int charCount;
    private static String longestWord;
    public static int wordCount;
    private boolean running;

    public theCounter() {
        this.longestWord = "";
        this.running = true;
    }
    public boolean isRunning() {
        return running;
    }
    public static int getWordCount() {
        return wordCount;
    }
    public static String getLongestWord() {
        return longestWord;
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
    public void countLongestWordChar (String text){

        if (text.equalsIgnoreCase("stop")){
            this.running = false;
        } else {
            String[] stringLine = text.split("\\s+");

            this.wordCount += stringLine.length;

            for (String line : stringLine) {
                if (longestWord.length() < line.length()) {
                    longestWord = line;
                }
            }
        }
    }
}


