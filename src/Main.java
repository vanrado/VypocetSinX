import java.util.Scanner;

/**
 * Program vypocita sinux X s pouzitim zakladnych operacii (+,-,*,/), vypocet
 * vykonava pre zvolenu presnost EPSILON podla Taylorovho rozvoja
 *
 * @author Radovan Račák
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println(Priklad.vypocitaj(60, 0.001));
        while (true) {
            String line;
            String line2;
            double cislo;
            double presnost;
            System.out.print("\nZadaj hodnotu sin X \n> ");
            line = sc.nextLine();

            System.out.print("\nZadaj presnost \n> ");
            line2 = sc.nextLine();

            if (line.equals("exit")) {
                break;
            }

            try {
                cislo = Double.parseDouble(line);
                presnost = Double.parseDouble(line2);

                System.out.println("Hodnota sin(" + cislo + ") s presnostou " + presnost + " podla Taylorovho rozvoja je + " + Priklad.vypocitaj(cislo, presnost));
                System.out.println("Hodnota podla triedy Math je " + Math.sin(cislo));
            } catch (NumberFormatException ex) {
                System.out.println("Zadali ste nespravny vstup: " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

}
