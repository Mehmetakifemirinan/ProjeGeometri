package geometrihesaplama;

public class Runner {
    public static void main(String[] args) {

        Cember cember = new Cember(5);
        cember.cevreHesaplama();
        cember.alanHesaplama();

        System.out.println(cember);


        Kare kare=new Kare(10,10);
        kare.cevreHesaplama();
        kare.alanHesaplama();

        System.out.println(kare);

        Dıktortgen dikdortgen = new Dıktortgen(10,5);
        dikdortgen.cevreHesaplama();
        dikdortgen.alanHesaplama();

        System.out.println(dikdortgen);
    }
}
