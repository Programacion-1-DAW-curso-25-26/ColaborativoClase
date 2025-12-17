package alumnos;

import java.util.ArrayList;


public class AlumnoAlfonso {
    public static ArrayList<Integer> misNumeros() {
        int[] numeros= {12345, 67890, 54321, 11111, 22222,
                33333, 44444, 55555, 66666, 77777};

        ArrayList<Integer>  milista = new ArrayList<>(numeros.length);

        for (int n : numeros) milista.add(n);

        return  milista;

    }

    public static String nombre() {
        return "Alfonso";   // o cualquier nombre que quieras mostrar
    }
}
