import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Crear una instancia del diccionario
        Diccionario diccionario = new Diccionario();

        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de Random para seleccionar palabras al azar
        Random random = new Random();

        // Obtener todas las palabras en español del diccionario
        List<String> palabrasEnSpanish = new ArrayList<>(diccionario.obtenerPalabras());

        // Seleccionar 5 palabras al azar
        Set<String> palabrasSeleccionadas = new HashSet<>();
        while (palabrasSeleccionadas.size() < 5) {
            int index = random.nextInt(palabrasEnSpanish.size());
            palabrasSeleccionadas.add(palabrasEnSpanish.get(index));
        }

        int correcta = 0;
        int incorrecta = 0;

        // Pedir al usuario que traduzca las palabras
        for (String palabra : palabrasSeleccionadas) {
            System.out.print("Puedes traducir a inglés la siguiente la palabra '" + palabra + "': ");
            String respuesta = scanner.nextLine();
            String traduccionCorrecta = diccionario.obtenerTraduccion(palabra);

            // Comprobar si la respuesta del usuario es correcta
            if (respuesta.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                correcta++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + traduccionCorrecta);
                incorrecta++;
            }
        }

        // Mostrar el resultado
        System.out.println("\nRespuestas correctas: " + correcta);
        System.out.println("Respuestas incorrectas: " + incorrecta);

        scanner.close();
    }
}
