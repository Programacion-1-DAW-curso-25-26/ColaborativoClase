package alumnos;

import java.util.ArrayList;


public class AlumnoVictorMacian {
    public static ArrayList<Integer> misNumeros() {
        int[] numeros= {23478, 46729, 28306, 89900, 26347,
                82911, 75670, 27823, 93612, 11235};

        ArrayList<Integer>  milista = new ArrayList<>(numeros.length);

        for (int n : numeros) milista.add(n);

        return  milista;

    }

    public static String nombre() {
        return "Victor";   // o cualquier nombre que quieras mostrar
    }
}
