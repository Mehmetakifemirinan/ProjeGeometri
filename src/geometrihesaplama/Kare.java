package geometrihesaplama;

public class Kare extends Sekil{

    public Kare(double uzunKenar, double kisaKenar){
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Kare " +
                "Kenar = " + uzunKenar +
                  " Kare cevre hesaplama = "+ cevreHesaplama()+ "Kare alan hesaplama =" + alanHesaplama();

    }
}
