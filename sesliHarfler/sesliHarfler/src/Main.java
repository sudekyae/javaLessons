//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char harf = 'E';

        switch (harf){
            case 'A':
            case 'O':
            case 'U':
            case 'I':
            System.out.println("Kalın sesli harftir");
            break;
            default:
                System.out.println("İnce sesli harftir");
        }
    }
}