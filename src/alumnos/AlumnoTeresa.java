package alumnos;

import java.util.ArrayList;


public class AlumnoTeresa {
    public static ArrayList<Integer> misNumeros() {
        int[] numeros= {58422, 15707, 25321, 87619, 30020,
                8514, 11911, 63777, 98624, 76535};

        ArrayList<Integer>  milista = new ArrayList<>(numeros.length);

        for (int n : numeros) milista.add(n);

        return  milista;

    }

    public static String nombre() {
        return "Teresa";   // o cualquier nombre que quieras mostrar
    }
}
