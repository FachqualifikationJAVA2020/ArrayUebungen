package de.bfz;

public class Aufgabe2 {
    public static void main(String[] args) {
        int[][] zahlenArray = {
                { 23, 34, -4 },
                { 7, 619 },
                { 102, -8, 5000, 0 }
        };

        for(int i = 0; i < zahlenArray.length; i++){
            for(int j = 0; j < zahlenArray[i].length; j++){

                if(zahlenArray[i][j] == 619) { // Element suchen
                    System.out.print("Gefunden!");
                }

            }
        }


    }
}
