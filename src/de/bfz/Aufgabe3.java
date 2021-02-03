package de.bfz;

import java.util.Arrays;

public class Aufgabe3 {
    public static void main(String[] args) {

        // Array für 6 Zufallszahlen
        int[] arrayRandom = new int[6];

        // Minimum und Maximum festlegen
        int randomMin = 0;
        int randomMax = 20;

        // Random Range
        int range = randomMax - randomMin + 1;

        // Zufallszahlen in Array übergeben
        for(int i = 0; i < arrayRandom.length; i++){
            int random = (int)(Math.random() * range) + randomMin;
            arrayRandom[i] = random;
            System.out.println("Zufallszahl: " + arrayRandom[i]);
        }

        // Array Sortieren
        Arrays.sort(arrayRandom);

        // Min und Max-Wert festlegen
        int minRandom = arrayRandom[0];
        int maxRandom = arrayRandom[arrayRandom.length - 1];

        // Ausgabe von Min und Max-Wert
        System.out.println("Kleinste Zahl: " + minRandom);
        System.out.println("Größte Zahl: " + maxRandom);

        // Jeder Wert im Array wird dazu gerechnet
        int mittelwert = 0;
        for ( int i = 0; i < arrayRandom.length; i++ ){
            mittelwert =  mittelwert + arrayRandom[i] ;
        }

        System.out.println("Der Mittelwert ist: " + mittelwert / arrayRandom.length);

}
}
