package de.bfz;

public class Aufgabe2 {
    public static void main(String[] args) {
        int[][] zahlenArray = {
                { 23, 34, -4 },
                { 7, 619 },
                { 102, -8, 5000, 0 }
        };

        boolean zahlGefunden = false;
        for (int i = 0; i < zahlenArray.length; i++) {
            for (int j = 0; j < zahlenArray[i].length; j++) {
                if(!zahlGefunden){
                    if(zahlenArray[i][j] >= 100 || zahlenArray[i][j] <= -100) {
                        System.out.println("Die Position der ersten dreistelligen Zahl lautet: " + i + " | Wert: " + zahlenArray[i][j]);
                        zahlGefunden = true;
                    }
                }
            }
        }
    }
}
