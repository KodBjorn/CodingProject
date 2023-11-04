import java.util.Scanner;

public class readWrite {


    private boolean run = true;
    private static String text;
    private Scanner scan = new Scanner(System.in);

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
    public static void setText(String text) {
        readWrite.text = text;
    }
    public String read (){

        text = scan.nextLine();
        if (text.equals("stop")){
            setRun(false);
        }
        return text;
    }
    public void write (int rowCount, int charCount){
        System.out.println("Du har skrivit " + rowCount + " rader.");
        System.out.println("och du har skrivit " + charCount + " tecken.");
    }
}

