//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char grade = 'K';

        switch(grade){
            case 'A':
                System.out.println("Mükemmel Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}