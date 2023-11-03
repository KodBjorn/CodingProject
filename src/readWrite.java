import java.util.Scanner;

public class readWrite {

    public void read (String[] myArray){

        int possition = 0;

        Scanner scan = new Scanner(System.in);

        while (true){

            myArray[possition] = scan.nextLine();

            if (myArray[possition].equals("stop")){
                break;
            }
            possition++;

        }

    }
    public void write (String[] myArray,int antalRader, int antalTecken){

        for (int i = 0; i<20; i++){
            if (myArray[i].isEmpty() || myArray[i].equals("stop")) {

            }else System.out.println(myArray[i]);
        }
        System.out.println("Du har skrivit " + antalRader + " rader.");
        System.out.println("och du har skrivit " + antalTecken + " tecken.");
    }
}
