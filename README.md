# 🎄 Sorteo de Navidad – Práctica GitHub + ArrayList

¡Hola!  
El último día de clase vamos a repasar `ArrayList` con un toque navideño.

---

## Objetivo
Simular 10 000 años del Sorteo de Navidad y ver cuánto habríamos ganado con nuestros números.

---

## Primera tarea – Tu boleto personal

1. **Clona** este repositorio y ábrelo como proyecto IntelliJ.
2. Crea una rama local:  
   `git checkout -b feature-tuNombre`
3. Dentro de la carpeta `alumnos` crea un fichero `AlumnoTuNombre.java` siguiendo este patrón:

```java
package alumnos;

import java.util.*;

public class AlumnoTuNombre {
    public static List<Integer> misNumeros() {
        return Arrays.asList(
            12345, 67890, 54321, 11111, 22222,
            33333, 44444, 55555, 66666, 77777
        );
    }

    public static String nombre() {
        return "TuNombre";   // sin espacios, sin repetir con compañeros
    }
}
```

4. **Sube** la rama directamente al remoto:  
   `git push -u origin feature-tuNombre`  

NOTA: También puedes hacer todos los comandos GIT con IntelliJ

---

## Segunda tarea – Implementa un premio secundario

1. Acuerda con la clase qué método de `SorteoNavidad` vas a programar  
   (cada método solo se implementa una vez).

   Lista de métodos pendientes:
   ```java
   aproxAnteriorGordo, aproxPosteriorGordo,
   aproxAnterior2o, aproxPosterior2o,
   aproxAnterior3o, aproxPosterior3o,
   centenaGordo, centena2o, centena3o, centena4o,
   dosCifrasGordo, dosCifras2o, dosCifras3o,
   reintegro
   ```

2. Crea una nueva rama:  
   `git checkout -b feature-nombreMetodo`
3. Implementa **solo** el método asignado en la clase `SorteoNavidad`.
    - Respeta la cabecera que ya existe.
    - Añade un **Javadoc** con tu nombre y una breve descripción.
    - Devuelve la cantidad ganada en euros (ej. `2000` para 2 000 €).
4. **Push directo** al remoto:  
   `git push -u origin feature-nombreMetodo`

---

## Notas finales
- No modifiques ninguna otra clase.
- Si cambias de opinión con los números, simplemente edita tu clase y vuelve a hacer push.
- ¡Feliz Navidad y que la suerte te acompañe!
```

