import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(20);
        sayilar.add("İstanbul");
        //System.out.println(sayilar.size());

        //sayilar.set(1, 100);
        //System.out.println(sayilar.get(1));
        /sayilar.remove(1);
        //System.out.println(sayilar.get(1));
        //sayilar.clealr(); tüm objeleri siler
        //System.out.println(sayilar.get(0));

        for(Object i: sayilar){
            System.out.println(i);
        }
    }
}