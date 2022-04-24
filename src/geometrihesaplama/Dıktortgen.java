package geometrihesaplama;

public class Dıktortgen extends Sekil {

    public Dıktortgen(double uzunKenar,double kisaKenar){
        super(uzunKenar, kisaKenar); //CONS.ILK SATIRINDA OLACAK.VERIABLE CAGIRMAK ICIN.DIREK PARENTTA GIDER.
    }


    public double diktortgenCevreHesaplama() {

        return super.diktorgenCevreHesaplama();
    }

    public double diktorgenAlanHesaplama() {

        return super.diktortgenAlanHesaplama();
    }

    @Override
    public String toString() {
        return "Diktorgen " +
                "uzunKenar = " + uzunKenar +
                ", kisaKenar = " + kisaKenar + "Diktorgen cevre hesaplama = " + diktorgenAlanHesaplama()+ "Diktorgen alan hesaplama = " + diktorgenCevreHesaplama();

    }
}
