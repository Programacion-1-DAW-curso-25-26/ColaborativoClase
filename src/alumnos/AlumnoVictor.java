package alumnos;

import java.util.ArrayList;


public class AlumnoVictor {
    public static ArrayList<Integer> misNumeros() {
        int[] numeros= {65843, 98765, 99999, 88888, 24282,
                67676, 68241, 23456, 97531, 27892};

        ArrayList<Integer>  milista = new ArrayList<>(numeros.length);

        for (int n : numeros) milista.add(n);

        return  milista;

    }

    public static String nombre() {
        return "Víctor";   // o cualquier nombre que quieras mostrar
    }
}
