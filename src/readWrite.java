import java.util.Scanner;

public class readWrite {

    private boolean run = true;

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public String read (){

        Scanner scan = new Scanner(System.in);
        if (scan.nextLine().equalsIgnoreCase("stop")){
            setRun(false);
        }
        return scan.nextLine();
    }
    public void write (int rowCount, int charCount){
        System.out.println("Du har skrivit " + rowCount + " rader.");
        System.out.println("och du har skrivit " + charCount + " tecken.");
    }
}

