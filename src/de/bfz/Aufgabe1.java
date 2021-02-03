package de.bfz;

public class Aufgabe1 {

    public static void main(String[] args) {

        int arrayInt[] = { -4,-5,-8,6,-10,-50 };

        for(int i = 0; i < arrayInt.length; i++){
            if(arrayInt[i] > 0){
                System.out.println("Positive Zahl gefunden: " + arrayInt[i]);
                break;
            }
        }
    }
}
