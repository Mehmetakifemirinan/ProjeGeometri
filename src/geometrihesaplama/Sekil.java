package geometrihesaplama;

public class Sekil {

    double uzunKenar;
    double yariCap;
    double kisaKenar;


     public Sekil(){

     }


    public Sekil(double yariCap) {
        this.yariCap=yariCap;
    }

    public Sekil(double uzunKenar,double kisaKenar){
        this.uzunKenar=uzunKenar;
        this.kisaKenar=kisaKenar;
    }

    public double cevreHesaplama(){

        return (uzunKenar+kisaKenar)*2;
    }

    public double alanHesaplama() {

        return uzunKenar*kisaKenar;
    }

    public double cemberAlan(){

        return yariCap*yariCap*3.14;
    }
}
