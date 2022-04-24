package geometrihesaplama;

public class Kare extends Sekil{

    public Kare(double kenar){

        super(kenar);
    }

    @Override
    public String toString() {
        return "Kare " +
                "Kenar = " +kenar +
                  " Kare cevre hesaplama = "+ kareCevreHesaplama()+ "Kare alan hesaplama =" + kareAlanHesaplama();

    }
}
