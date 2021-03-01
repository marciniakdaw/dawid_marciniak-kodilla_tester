public class UzycieSamochodu {

    public static void main(String[] args) {
        Samochod samochod1 = new Samochod(); // 1
        samochod1.ustawKolor("Zielony");
        samochod1.ustawPredkosc(50);

        Samochod samochod2 = new Samochod(); // 2
        samochod2.ustawKolor("Niebieski");
        samochod2.ustawPredkosc(60);
        
        samochod1.wypiszInformacje();
        samochod2.wypiszInformacje();
    }
}