package alumnos;

import java.util.ArrayList;

public class AlumnoLuis {
    public static ArrayList<Integer> misNumeros() {
        int[] numeros= {84629, 39174, 50268, 17493, 96821,
                23745, 68410, 75932, 41086, 92357};

        ArrayList<Integer>  milista = new ArrayList<>(numeros.length);

        for (int n : numeros) milista.add(n);

        return  milista;

    }

    public static String nombre() {
        return "Luis";   // o cualquier nombre que quieras mostrar
    }
}
