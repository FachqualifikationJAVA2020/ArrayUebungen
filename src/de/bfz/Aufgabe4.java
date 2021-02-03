package de.bfz;

public class Aufgabe4 {
    public static void main(String[] args) {

        // boolean Array Primzahlen
        boolean[] primZahlen = new boolean[150];

        /* Starten bei 2. 0 & 1 sind keine Primzahlen,
         * Alle anderen werden erstmal auf true gesetzt
         * bis wir das gegenteil beweisen
         */
        for (int i = 2; i < primZahlen.length; i++) {
            primZahlen[i] = true;
        }

        /*
         * Jedes Feld wird jetzt nach einer Zahl durchsucht
         * das true ist, sobald es gefunden wurde setzten wir alle
         * vielfachen auf false
         */
        for(int p = 0; p < primZahlen.length; p++) {
            // Primzahl wurde gefunden
            if (primZahlen[p]) {
                for(int v = 2 * p; v < primZahlen.length; v = v + p) {
                    //alle Vielfachen von p "wegstreichen"
                    primZahlen[v] = false;
                }
            }
        }

        /*
         * Ausgabe der Primzahlen
         */
        for(int i = 0; i < primZahlen.length; i++) {
            if (primZahlen[i]) {
                System.out.println("Zahl: " + i + " | " + primZahlen[i]);
            }
        }



    }
}
