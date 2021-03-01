public class Samochod {

    private int predkosc;
    private String kolor;

    public void ustawPredkosc(int nowaPredkosc) {
        predkosc = nowaPredkosc;
    }

    public void ustawKolor(String nowyKolor) {
        kolor = nowyKolor;
    }

    public void wypiszInformacje() {
        System.out.println("Jestem samochodem! Moj kolor to " + kolor +
                ", jade z predkoscia " + predkosc);
    }
}
