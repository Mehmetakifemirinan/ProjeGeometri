package geometrihesaplama;

public class Runner {
    public static void main(String[] args) {

        Cember cember = new Cember(5);
        cember.cevreHesaplama();
        cember.alanHesaplama();

        System.out.println(cember);


        Kare kare=new Kare(10,10);
        kare.kareCevreHesaplama();
        kare.kareAlanHesaplama();

        System.out.println(kare);

        Dıktortgen dikdortgen = new Dıktortgen(10,5);
        dikdortgen.diktortgenCevreHesaplama();
        dikdortgen.diktorgenAlanHesaplama();

        System.out.println(dikdortgen);
    }
}
