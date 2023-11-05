
public class Main {

    public static void main(String[] args) {

        String textDump;
        readWrite readWriter = new readWrite();
        theCounter counter = new theCounter();


        while (true){

            textDump = readWriter.read();
            //if(!readWriter.isRun()){
            //    break;
            //}
            counter.countLongestWordChar(textDump);
            if(!counter.isRunning()) {
                break;
            }
            counter.countingRader();
            counter.countingTecken(textDump);

        }
        readWriter.write(counter.getRowCount(),counter.getCharCount());
        readWriter.writeLongest(counter.getLongestWord());
        readWriter.customWriter(counter.getWordCount());
    }
}

