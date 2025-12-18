package alumnos;

import java.util.ArrayList;


public class AlumnoAHueso {
    public static ArrayList<Integer> misNumeros() {
        int[] numeros= {54542, 67890, 54321, 11111, 22222,
                33333, 44444, 54545, 66666, 77777};

        ArrayList<Integer>  milista = new ArrayList<>(numeros.length);

        for (int n : numeros) milista.add(n);

        return  milista;

    }

    public static String nombre() {
        return "Alfonso Hueso";   // o cualquier nombre que quieras mostrar
    }
}
