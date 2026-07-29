//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        sayiBulmaca();

    }
    //camel casing
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 6;
        boolean varMi = false;

        for(int sayi : sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }

        if(varMi){
            mesajVer(aranacak);
        }else{
            System.out.println("Sayı mevcut değildir "+aranacak);
        }
    }

    public static void mesajVer(int aranacak){
        System.out.println("Sayı mevcuttur: "+aranacak);
    }
}