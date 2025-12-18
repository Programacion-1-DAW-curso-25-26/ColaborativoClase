package alumnos;

import java.util.ArrayList;


public class AlumnoClaudia {
    public static ArrayList<Integer> misNumeros() {
        int[] numeros= {66674, 99944, 35226, 44771, 33358,
                99865, 74885, 16634, 74485, 66693};

        ArrayList<Integer>  milista = new ArrayList<>(numeros.length);

        for (int n : numeros) milista.add(n);

        return  milista;

    }

    public static String nombre() {
        return "Claudia";   // o cualquier nombre que quieras mostrar
    }
}
