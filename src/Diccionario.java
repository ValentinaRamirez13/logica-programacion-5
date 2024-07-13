import java.util.*;

class Diccionario {
    private Map<String, String> diccionario;

        public Diccionario(){
            diccionario = new HashMap<>();
        //Agregar palabras al diccionario, relacionadas a la tecnología
        diccionario.put("Computadora", "Computer");
        diccionario.put("Teclado", "Keyboard");
        diccionario.put("Ratón", "Mouse");
        diccionario.put("Monitor", "Monitor");
        diccionario.put("Impresora", "Printer");
        diccionario.put("Red", "Network");
        diccionario.put("Internet", "Internet");
        diccionario.put("Servidor", "Server");
        diccionario.put("Base de datos", "Database");
        diccionario.put("Programa", "Program");
        diccionario.put("Software", "Software");
        diccionario.put("Hardware", "Hardware");
        diccionario.put("Archivo", "File");
        diccionario.put("Memoria", "Memory");
        diccionario.put("Procesador", "Processor");
        diccionario.put("Sistema operativo", "Operating System");
        diccionario.put("Aplicación", "Application");
        diccionario.put("Navegador", "Browser");
        diccionario.put("Código", "Code");
        diccionario.put("Desarrollador", "Developer");
        }

         // Método para traducir una palabra en español al inglés
        public String traducir(String palabra) {
        return diccionario.getOrDefault(palabra, "Traducción no encontrada");
       }

        // Método para obtener todas las palabras en español del diccionario
        public Set<String> obtenerPalabras() {
        return diccionario.keySet();
        }

         // Método para obtener la traducción de una palabra en español
        public String obtenerTraduccion(String palabra) {
        return diccionario.get(palabra);
        }

    }

