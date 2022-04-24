package geometrihesaplama;

public class Sekil {

    double uzunKenar;
    double yariCap;
    double kisaKenar;
    double kenar;
    double pi=3.14;


    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;

    }

    public Sekil( double kenar){
    this.kenar=kenar;

    }


    public Sekil(double yariCap, double pi) {

        this.yariCap = yariCap;
            this.pi = 3.14;
        }

        public double diktorgenCevreHesaplama () {

            return (uzunKenar + kisaKenar) * 2;
        }
        public double diktortgenAlanHesaplama () {

        return uzunKenar * kisaKenar;
    }


    public double kareAlanHesaplama () {

            return Kenar * Kenar;
        }

        public double kareCevreHesaplama () {

            return (Kenar + Kenar) * 2;
        }


        public double cemberAlan () {

            return yariCap * yariCap * 3.14;

        }

        public double cemberCevre () {

            return yariCap * 2 * 3.14;
        }
    }

