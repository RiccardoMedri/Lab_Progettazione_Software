public class Calculator {

    int nOpDone;
    double lastRes;

    void build() {
        this.nOpDone = 0;  //conta il numero di operazioni compiute dalla calcolatrice
        this.lastRes = 0;  //memorizza l'ultimo risultato computato
    }

    double add (double a, double b) {
        double somma = a + b;
        this.nOpDone += 1;
        this.lastRes = somma;
        return somma;
    }

    double sub (double c, double d) {
        double differenza = c - d;
        this.nOpDone += 1;
        this.lastRes = differenza;
        return differenza;
    }

    double mul (double e, double f) {
        double prodotto = e * f;
        this.nOpDone += 1;
        this.lastRes = prodotto; 
        return prodotto;
    }

    double div (double g, double h) {
        double quoziente = g / h;
        this.nOpDone += 1;
        this.lastRes = quoziente;
        return quoziente;
    }
}
