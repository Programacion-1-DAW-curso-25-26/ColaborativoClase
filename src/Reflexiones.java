import java.io.File;
import java.lang.reflect.*;
import java.net.URL;
import java.util.*;

public final class Reflexiones {

    private Reflexiones() { } // no instanciable

    /**
     * Devuelve todas las clases de un paquete que tengan un método estático
     * {@code misNumeros()} que retorne {@code List<Integer>}.
     */
    public static ArrayList<Class<?>> clasesConMisNumeros(String paquete) {
        try {
            ArrayList<Class<?>> todas = encontrarClasesEnPaquete(paquete);
            ArrayList<Class<?>> validas = new ArrayList<>();
            for (Class<?> c : todas) {
                try {
                    Method m = c.getDeclaredMethod("misNumeros");
                    if (Modifier.isStatic(m.getModifiers()) &&
                            m.getReturnType().equals(ArrayList.class)) {
                        validas.add(c);
                    }
                } catch (NoSuchMethodException ignored) { }
            }
            return validas;
        } catch (Exception e) {
            throw new RuntimeException("Error al buscar clases", e);
        }
    }

    /**
     * Ejecuta {@code misNumeros()} de una clase y devuelve la lista de números.
     * @throws RuntimeException si algo falla.
     */
    @SuppressWarnings("unchecked")
    public static ArrayList<Integer> invocarMisNumeros(Class<?> clase) {
        try {
            Method m = clase.getDeclaredMethod("misNumeros");
            return (ArrayList<Integer>) m.invoke(null);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo invocar misNumeros en " + clase, e);
        }
    }

    public static String invocarNombre(Class<?> clase) {
        try {
            Method m = clase.getDeclaredMethod("nombre");
            return (String) m.invoke(null);
        } catch (Exception e) {
            // fallback: quita el prefijo "Alumno"
            return clase.getSimpleName().replace("Alumno", "");
        }
    }

    /* ---------- Métodos privados ---------- */

    private static ArrayList<Class<?>> encontrarClasesEnPaquete(String paquete) throws Exception {
        ArrayList<Class<?>> clases = new ArrayList<>();
        String path = paquete.replace('.', '/');
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Enumeration<URL> resources = loader.getResources(path);

        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            File dir = new File(resource.toURI());
            if (!dir.exists()) continue;
            for (File f : Objects.requireNonNull(dir.listFiles())) {
                if (f.getName().endsWith(".class")) {
                    String className = paquete + "." + f.getName().replace(".class", "");
                    clases.add(Class.forName(className));
                }
            }
        }
        return clases;
    }
}