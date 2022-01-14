import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double patlican = 5.00, muz = 0.95, domates = 1.11, elma = 3.67, armut = 2.14;
        double a, e, d, m, p;
        Scanner kg = new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        a = kg.nextDouble();
        System.out.print("Elma kaç kilo: ");
        e = kg.nextDouble();
        System.out.print("Domates kaç kilo: ");
        d = kg.nextDouble();
        System.out.print("Muz kaç kilo: ");
        m = kg.nextDouble();
        System.out.print("Patlıcan kaç kilo: ");
        p = kg.nextDouble();

        double toplam=armut*a+elma*e+domates*d+muz*m+patlican*p;
        System.out.println(toplam>0? "Toplam tutar: "+toplam+"TL" : "Lütfen sıfırdan büyük değerler giriniz");

    }
}
