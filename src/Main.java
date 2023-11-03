
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

       //Scanner scan = new Scanner(System.in);
        readWrite reader = new readWrite();
        theCounter counter = new theCounter();
        String[] myArray = new String[20];
        for (int i = 0; i<20; i++) {
            myArray[i] = "";
        }

        reader.read(myArray);
        counter.countingRader(myArray);
        reader.write(myArray,counter.countingRader(myArray),counter.countingTecken(myArray));


    }
}
