
import java.util.Scanner;
public class BodyMassIndex {     public static void main(String[] args) {

    //vucut-bot indexi
    double kilo, boy, kitleIndex─▒;
    Scanner input = new Scanner(System.in);

    System.out.print("LUTFEN BOYUNUZU GIRINIZ = ");
    boy = input.nextDouble();

    System.out.print("LUTFEN KILONUZU GIRINIZ = ");
    kilo = input.nextDouble();

    kitleIndex─▒ =( kilo /( boy * boy));

    System.out.println("VUCUT KITLE INDEXINIZ = " + kitleIndex─▒);




}

}
