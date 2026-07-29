//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int sayi = 6;
        int toplam = 0;

        System.out.println(sayi+ "sayısının bölenleri:");
        for(int i=1;i<sayi; i++){
            if(sayi%i==0){
                System.out.println(i);
                toplam+=i;
            }
        }
        System.out.println("bölenlerin toplamı: "+toplam);

        if(toplam==sayi){
            System.out.println(sayi+ "=" +toplam );
            System.out.println(sayi+ " mükemmel bir sayıdır");
        }else{
            System.out.println(sayi+ " mükemmel sayı değildir");
        }
    }
}