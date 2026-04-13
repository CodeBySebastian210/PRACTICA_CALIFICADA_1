
public class Actividad {
    public static void main(String[] args) {
        int arreglo[] = new int[5];
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;

        int posicion = 1;
        int nuevoValor = 15;
        for (int i = 3; i > posicion; i--) {
            arreglo[i] = arreglo[i - 1];
        }
        arreglo[posicion] = nuevoValor;

        arreglo[2] = 25; 

        System.out.println("Recorrido del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }

        int copia[] = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
        System.out.println("\nArreglo copiado:");
        for (int i = 0; i < copia.length; i++) {
            System.out.println("Posición " + i + ": " + copia[i]);
        }
    }    
}
