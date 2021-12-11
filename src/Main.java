import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double numero1 = 17;
        double numero2 = 0;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        String archivo = "C:/User/Pepico.txt";
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(1);

        errorAlDividirEntreCero(numero1,numero2);
        errorEnArray(lista);
        errorEnUnArchivo(archivo);
    }

    private static void errorEnUnArchivo(String archivo) {
        try {
            InputStream is = new FileInputStream(archivo);
        } catch ( FileNotFoundException e ) {
            System.out.println("Error:           --> " + e.getMessage());
        }
    }

    private static void errorEnArray(ArrayList<Integer> lista) {
        try {
            lista.get(9);
        } catch (IndexOutOfBoundsException e) {
            System.out.println( e.getMessage() );
        }
    }
    public static void errorAlDividirEntreCero(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println( resultado );

    }

}
