/**
 *
 * @author Radovan Račák
 */
public class Priklad {

    public Priklad() {
    }

    /**
     * pouzijeme taylorov rozvoj dane funkcie Sin X = x - x3/3! + x5/5! - x7/7!
     *
     * @param paX hodnota pre argument sin(x)
     * @param presnost hodnota epsilon
     * @return hodnota sin(x)
     */
    public static double vypocitaj(double paX, double presnost) {
        double sinus;
        double clen;
        int i;
        double x = paX;
        //Presunieme parameter funkcie do intervalu <0, 2*PI>
        while (x >= 2 * Math.PI) {
            x = x - 2 * Math.PI;
        }

        while (x <= 0) {
            x = x + 2 * Math.PI;
        }

        clen = x;
        sinus = clen;
        i = 1;

        while (Math.abs(clen) > (Math.abs(sinus) * presnost * 0.1)) {
            i += 2;
            clen = -clen * x * x / (i * (i - 1));
            sinus += clen;
        }

        return sinus;
    }
}
