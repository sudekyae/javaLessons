//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

//        abstract sınıflar tek başına new lenemez.
//        GameCalculator gameCalculator = new GameCalculator() {
//            @Override
//            public void hesapla() {
//
//            }
        GameCalculator gameCalculator = new WomanGameCalculator();
    }
}