import java.util.Scanner;

public class readWrite {


    private boolean run = true;

    private final Scanner scan = new Scanner(System.in);

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
    public String read (){

        String text = scan.nextLine();
        if (text.equals("stop")){
            setRun(false);
        }
        return text;
    }
    public void write (int rowCount, int charCount){
        System.out.println("Du har skrivit " + rowCount + " rader.");
        System.out.println("och du har skrivit " + charCount + " tecken.");
    }
    public void writeLongest (String text){
        System.out.println("Det längsta ordet du skrev är " + text);
    }
    public void customWriter (int wordCount){
        System.out.println("Du har skrivit " + wordCount + " ord");
    }
}

