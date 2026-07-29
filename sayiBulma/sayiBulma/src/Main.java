//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 13;
        boolean varMi = false;

        for(int i=0; i< sayilar.length; i++){
            if(aranacak==sayilar[i]){
                varMi = true;
                break;
            }
        }

        if(varMi){
            System.out.println("Aranan sayı dizi içerisinde mevcut");
        }else{
            System.out.println("Aranan sayı dizi içerisinde mevcut değil");
        }

        //for(int sayi : sayilar){
        //  if(sayi == aranacak){
        //     varMi = true;
        //    break;
        //}

    }
}