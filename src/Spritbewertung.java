import java.util.Scanner;

public class Spritbewertung {

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        char motorTyp;
        double kraftstoff = 0.0;
        double energie = 0.0;
        double verbrauch;

        do {
            System.out.print("Verbrennungsmotor oder Elektromotor (V/E)? ");
            motorTyp = eingabe.next().toUpperCase().charAt(0);
        } while ( motorTyp != 'V' &&  motorTyp != 'E' );

        System.out.print("Anzahl Kilometer: ");
        double kilometer = eingabe.nextDouble();

        if (motorTyp == 'E') {
            System.out.print("Verbrauchte Energie: ");
            energie = eingabe.nextDouble();
            verbrauch = energie * 100 / kilometer;
        }
        else {
            System.out.print("Verbrauchter Kraftstoff: ");
            kraftstoff = eingabe.nextDouble();
            verbrauch = kraftstoff / kilometer * 100;
        }

        System.out.println("Der Verbrach liegt bei " + verbrauch);

    }

}
