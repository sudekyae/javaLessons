public abstract class GameCalculator {
    public abstract void hesapla();
    //abstract classının içinde abstract olmayan islemler de bulunabilir
    public void gameOver(){
        System.out.println("Oyun bitti");
    }
}
