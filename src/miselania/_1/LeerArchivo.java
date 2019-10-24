package miselania._1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo {

    public static void main(String[] args) throws IOException {
        readFile("/home/jhorkman/data.txt");
    }

    private static void readFile(String fileName) throws FileNotFoundException, IOException {
        String text;
        StringBuilder fullText = new StringBuilder();
        FileReader file = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(file);
        while ((text = bufferedReader.readLine()) != null) {
            fullText.append( text + " ");
        }
        bufferedReader.close();
        System.out.println(fullText);
        splitLetter(fullText);

    }

    private static boolean esPrimo(int numero) {
        if (numero == 1) return false;
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }

    private static void splitLetter(StringBuilder text) {
        int sumPrimos = 0;
        int sumPairs = 0;
        String[] parseString = text.toString().trim().split(" ");
        for (String letter : parseString) {
            int number = Integer.parseInt(letter);
            if (esPrimo(number)) {
                sumPrimos += number;
            }
            if (number % 2 == 0) {
                sumPairs += number;
            }
        }
        System.out.println("sum primos: " + sumPrimos);
        System.out.println("sum pares: " + sumPairs);
    }
}
