
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        String textDump;
        readWrite readAndWrite = new readWrite();
        theCounter counter = new theCounter();


        while (readAndWrite.isRun()){

            textDump = readAndWrite.read();
            counter.countingRader();
            counter.countingTecken(textDump);

        }
        readAndWrite.write(counter.getRowCount(),counter.getCharCount());
    }
}

