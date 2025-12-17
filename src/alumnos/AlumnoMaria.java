package alumnos;

import java.util.ArrayList;


public class AlumnoMaria {
    public static ArrayList<Integer> misNumeros() {
        int[] numeros = { 98765, 13579, 24680, 11223, 99887,
                33445, 55667, 77889, 99001, 12321 };;

        ArrayList<Integer>  milista = new ArrayList<>(numeros.length);

        for (int n : numeros) milista.add(n);

        return  milista;

    }

    public static String nombre() {
        return "María";   // o cualquier nombre que quieras mostrar
    }
}
