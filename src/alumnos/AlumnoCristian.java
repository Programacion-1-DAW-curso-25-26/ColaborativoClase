package alumnos;

import java.util.ArrayList;


public class AlumnoCristian {
    public static ArrayList<Integer> misNumeros() {
        int[] numeros= {77777, 65421, 73737, 33333, 95612,
                30120, 12305, 51230, 33733, 77377};

        ArrayList<Integer>  milista = new ArrayList<>(numeros.length);

        for (int n : numeros) milista.add(n);

        return  milista;

    }

    public static String nombre() {
        return "Cristian";   // o cualquier nombre que quieras mostrar
    }
}
