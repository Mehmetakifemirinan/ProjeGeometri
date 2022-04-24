package geometrihesaplama;

public class Cember extends Sekil {

    public Cember(double yariCap,double pi){

        super(yariCap);
        super(pi);
    }
    public double cemberCevre() {

        return super.cemberCevre();
    }


    public double cmberCevre() {

        return super.cemberAlan();
    }

    @Override
    public String toString() {
        return
                "yariCap = " + yariCap + "cember cevre = "+ cemberAlan()+"cember alan = "+ cemberCevre()+"cemberCevre="+cemberCevre();

    }
}
