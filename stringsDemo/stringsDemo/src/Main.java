//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";

        System.out.println(mesaj);

       // System.out.println("Eleman sayısı: "+mesaj.length());
        // System.out.println("5. eleman: "+mesaj.charAt(4));
         //concat --> iki metni birleştirme
       //  System.out.println(mesaj.concat("Yaşasın!"));
         //B harfi ile başlıyor mu?
        // System.out.println(mesaj.startsWith("B"));
         //B harfi ile bitiyor mu?
        // System.out.println(mesaj.endsWith("B"));

         //char[] karakterler = new char[5];
         //karakter çağırmak için kullanılır getChars
         //mesaj.getChars(srcBegin: 0, srcEnd: 5, karakterler, dstBegin: 0);
         //System.out.println(karakterler);

        //ilk bulduğu a harfinde işlem biter
        // System.out.println(mesaj.indexOf('a'));
        // System.out.println(mesaj.indexOf("av"));
        //System.out.println(mesaj.lastIndexOf('a'));

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        //2 den başla 4 e kadar yaz
        System.out.println(mesaj.substring(2,4));

        //kelimeleri tek tek yazdırma
        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        //tüm harfleri küçült
        System.out.println(mesaj.toLowerCase());
        //tüm harfleri büyült
        System.out.println(mesaj.toUpperCase());
        //başa ve sona boşluk koymak için
        System.out.println(mesaj.trim());
    }
}