package geometrihesaplama;

public class Dıktortgen extends Sekil {

    public Dıktortgen(double uzunKenar,double kisaKenar){
        super(uzunKenar, kisaKenar);
    }


    public double cevreHesaplama() {

        return super.cevreHesaplama();
    }

    public double alanHesaplama() {

        return super.alanHesaplama();
    }

    @Override
    public String toString() {
        return "Diktorgen " +
                "uzunKenar = " + uzunKenar +
                ", kisaKenar = " + kisaKenar + "Diktorgen cevre hesaplama = " + cevreHesaplama()+ "Diktorgen alan hesaplama = " + alanHesaplama();

    }
}
