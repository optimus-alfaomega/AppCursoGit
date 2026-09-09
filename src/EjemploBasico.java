public class EjemploBasico {
    public static void main(String[] args) {
        // Imprimir un mensaje simple
        System.out.println("¡Hola, Mundo!");

        // Variables básicas
        String nombre = "Alex";
        int edad = 25;

        // Uso de una variable en un mensaje
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años.");

        // Llamada a un método
        int resultado = sumar(5, 7);
        System.out.println("La suma de 5 + 7 es: " + resultado);

        // Estructura condicional
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }

        // Bucle for
        System.out.println("Contando del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
    }

    // Método que suma dos números
    public static int sumar(int a, int b) {
        return a + b;
    }
}
