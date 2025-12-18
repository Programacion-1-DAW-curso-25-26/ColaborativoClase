import java.util.*;

public class SorteoNavidad {

    /**
     * Devuelve un Set con todos los números del 0 al 99 999.
     * Usamos Set para evitar duplicados (aunque aquí no los habrá).
     */
    public static ArrayList<Integer> llenarBombo() {
        ArrayList<Integer> bombo = new ArrayList<>(); // mantiene orden de inserción
        for (int i = 0; i < 100_000; i++) {
            bombo.add(i);
        }
        Collections.shuffle(bombo);
        return bombo;
    }

    public static ArrayList<Integer> llenarBomboPremios() {
        ArrayList<Integer> bombo = new ArrayList<>();

        // Premio gordo
        bombo.add(400000);

        // Segundo premio
        bombo.add(125000);

        // Tercer premio
        bombo.add(50000);

        // Cuartos premios (2 números)
        for (int i = 0; i < 2; i++) bombo.add(20000);

        // Quintos premios (8 números)
        for (int i = 0; i < 8; i++) bombo.add(6000);

        // Pedreas (1 794 premios de 100 €)
        for (int i = 0; i < 1_794; i++) bombo.add(100);

        Collections.shuffle(bombo);
        return bombo;
    }

    public static HashMap<Integer, Integer> sortear( ArrayList<Integer> bomboNumeros , ArrayList<Integer> bomboPremios){
        HashMap<Integer, Integer>premiados = new HashMap<>();

        for (int i = 0; i < bomboPremios.size(); i++) {
            premiados.put(bomboNumeros.get(i), bomboPremios.get(i));
        }

        return premiados;

    }

    public static int comprobarBoleto(List<Integer> misNumeros, HashMap<Integer, Integer> premiados) {
        int total = 0;
        for (int n : misNumeros) {
            if (premiados.containsKey(n))
                total += premiados.get(n);
        }
        return total;
    }



    /* =========================================================
   PREMIOS SECUNDARIOS – PLANTILLA COMPLETA
   ========================================================= */

    /** 1. Aproximación anterior al Gordo (2 000 €) */
    public static int aproxAnteriorGordo(int gordo, List<Integer> nums) {
        return 0;
    }

    /** 2. Aproximación posterior al Gordo (2 000 €) */
    public static int aproxPosteriorGordo(int gordo, List<Integer> nums) {
        return 0;
    }

    /** 3. Aproximación anterior al 2.º premio (1 250 €) */
    public static int aproxAnterior2o(int segundo, List<Integer> nums) {
        int anterior = segundo - 1;
        int premio = 0;
        for (int n : nums) {
            if (n == anterior) {
                premio = 1250;
            }
        }
        return premio;
    }

    /** 4. Aproximación posterior al 2.º premio (1 250 €) */
    public static int aproxPosterior2o(int segundo, List<Integer> nums) {
        int anterior = segundo + 1;
        int premio = 0;
        for (int n : nums) {
            if (n == anterior) {
                premio = 1250;
            }
        }
        return premio;
    }

    /** 5. Aproximación anterior al 3.º premio (960 €) */
    public static int aproxAnterior3o(int tercero, List<Integer> nums) {
        return 0;
    }

    /** 6. Aproximación posterior al 3.º premio (960 €) */
    public static int aproxPosterior3o(int tercero, List<Integer> nums) {
        return 0;
    }

    /** 7. Centena del Gordo (100 € por número) */
    public static int centenaGordo(int gordo, List<Integer> nums) {
        return 0;
    }

    /** 8. Centena del 2.º premio (100 € por número) */
    public static int centena2o(int segundo, List<Integer> nums) {
        return 0;
    }

    /** 9. Centena del 3.º premio (100 € por número) */
    public static int centena3o(int tercero, List<Integer> nums) {
        return 0;
    }

    /** 10. Centena de los 4.º premios (100 € por número) */
    public static int centena4o(List<Integer> cuartos, List<Integer> nums) {
        return 0;
    }

    /** 11. 2 últimas cifras del Gordo (100 € por número) */
    public static int dosCifrasGordo(int gordo, List<Integer> nums) {
        return 0;
    }

    /** 12. 2 últimas cifras del 2.º premio (100 € por número) */
    public static int dosCifras2o(int segundo, List<Integer> nums) {
        return 0;
    }

    /** 13. 2 últimas cifras del 3.º premio (100 € por número) */
    public static int dosCifras3o(int tercero, List<Integer> nums) {
        return 0;
    }

    /** 14. Reintegro (20 € por número) */
    public static int reintegro(int gordo, List<Integer> nums) {
        int finalizacion = gordo % 10;
        int premio = 0;
        for (int n:nums){
            if (n%10==finalizacion)
                premio+=20;
        }
        return premio;
    }



    public static void main(String[] args) {


        ArrayList<Class<?>> alumnos = Reflexiones.clasesConMisNumeros("alumnos");
        HashMap<String, Long> premiosAcumulados = new HashMap<>();


        System.out.println("######################################");
        System.out.println("Haciendo 10000 veces el sorteo!!!");
        System.out.println("Atención a los premios gordos!!!");
        System.out.println("######################################");


        for (int anyo=2025;anyo<12025;anyo++) {

            ArrayList<Integer> bomboNumeros = llenarBombo();
            ArrayList<Integer> bomboPremios = llenarBomboPremios();

            HashMap<Integer, Integer> premiados = sortear(bomboNumeros,bomboPremios);

            // Extraemos los números clave
            int gordo   = -1;
            int segundo = -1;
            int tercero = -1;
            List<Integer> cuartos = new ArrayList<>();

            for (Map.Entry<Integer, Integer> e : premiados.entrySet()) {
                int n = e.getKey();
                int p = e.getValue();
                switch (p) {
                    case 400000:
                        gordo = n;
                        break;
                    case 125000:
                        segundo = n;
                        break;
                    case 50000:
                        tercero = n;
                        break;
                    case 20000:
                        cuartos.add(n);
                        break;
                }
            }


            for (Class<?> alumno : alumnos) {
                ArrayList<Integer> numeros = Reflexiones.invocarMisNumeros(alumno);
                if (numeros.size()==10){
                    long ganado = SorteoNavidad.comprobarBoleto(numeros, premiados);

                    long extra = 0;
                    extra += SorteoNavidad.aproxAnteriorGordo(gordo, numeros);
                    extra += SorteoNavidad.aproxPosteriorGordo(gordo, numeros);
                    extra += SorteoNavidad.aproxAnterior2o(segundo, numeros);
                    extra += SorteoNavidad.aproxPosterior2o(segundo, numeros);
                    extra += SorteoNavidad.aproxAnterior3o(tercero, numeros);
                    extra += SorteoNavidad.aproxPosterior3o(tercero, numeros);
                    extra += SorteoNavidad.centenaGordo(gordo, numeros);
                    extra += SorteoNavidad.centena2o(segundo, numeros);
                    extra += SorteoNavidad.centena3o(tercero, numeros);
                    extra += SorteoNavidad.centena4o(cuartos, numeros);
                    extra += SorteoNavidad.dosCifrasGordo(gordo, numeros);
                    extra += SorteoNavidad.dosCifras2o(segundo, numeros);
                    extra += SorteoNavidad.dosCifras3o(tercero, numeros);
                    extra += SorteoNavidad.reintegro(gordo, numeros);

                    ganado += extra;


                    String nombre = Reflexiones.invocarNombre(alumno);
                    if (ganado == 400000)
                    {
                        System.out.println(nombre + ", te tocó el gordo " + gordo + " en el año " + anyo + "!!!!");
                    }

                    if (ganado != 0){
                        if (premiosAcumulados.containsKey(nombre)){
                            ganado+=premiosAcumulados.get(nombre);;
                        }
                        premiosAcumulados.put(nombre, ganado);
                    }

                }

            }

        }

        long gasto = 10*20*10000;
        System.out.println("-----------------------------------------------");
        System.out.println("Capital invertido por cada alumno " + gasto);
        for (Map.Entry<String,Long> alumno:premiosAcumulados.entrySet()){
            System.out.println("El alumno " + alumno.getKey() + " consiguió en premios " +  alumno.getValue() + "€ en 10000 años. Balance " + (alumno.getValue()-gasto) + "€" );

        }



    }

}
