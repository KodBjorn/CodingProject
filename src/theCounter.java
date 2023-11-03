
public class theCounter {
    public int countingRader (String[] myArray){

        int antalRader = 0;

        for (int i = 0; i < 20; i++) {

            if (myArray[i].isEmpty() || myArray[i].equals("stop")){

            }else antalRader++;
        }
        return antalRader;
    }
    public int countingTecken (String[] myArray){

        int antalTecken = 0;

        for (int i = 0; i < 20; i++) {

            if (myArray[i].isEmpty() || myArray[i].equals("stop")){

            } else antalTecken = antalTecken + myArray[i].replaceAll("\\s+", "").length();

        }
        return antalTecken;
    }
}
