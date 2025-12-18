package alumnos;

import java.util.ArrayList;


public class AlumnoDanny {
    public static ArrayList<Integer> misNumeros() {
        int[] numeros= {92373, 10094, 73893, 94684, 74975,
                20193, 49674, 92384, 72924, 91023};

        ArrayList<Integer>  milista = new ArrayList<>(numeros.length);

        for (int n : numeros) milista.add(n);

        return  milista;

    }

    public static String nombre() {
        return "Danny";   // o cualquier nombre que quieras mostrar
    }
}
