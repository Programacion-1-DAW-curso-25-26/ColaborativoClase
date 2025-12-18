package alumnos;

import java.util.ArrayList;


public class AlumnoYassir {
    public static ArrayList<Integer> misNumeros() {
        int[] numeros= {14897, 48372, 19506, 82714, 56039,
                3148, 72941, 60823, 47195, 93268};

        ArrayList<Integer>  milista = new ArrayList<>(numeros.length);

        for (int n : numeros) milista.add(n);

        return  milista;

    }

    public static String nombre() {
        return "Yassir";   // o cualquier nombre que quieras mostrar
    }
}