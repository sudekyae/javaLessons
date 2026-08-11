import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        sehirler.remove("istanbul");
        Collections.sort(sehirler);
        for(String sehir: sehirler){
            System.out.println(sehir);
        }
    }
}