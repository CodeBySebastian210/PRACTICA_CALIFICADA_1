import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Actividad {
    public static void main(String[] args) {
        int arreglo[] = {5, 10, 15};
        Stack<Integer> pila = new Stack<>();
        Queue<Integer> cola = new LinkedList<>();
        
        System.out.println("ARREGLO:");
        System.out.println("Elemento en posicion 1: " + arreglo[1]);
        
        pila.push(100);
        pila.push(200);
        System.out.println("PILA:");
        System.out.println("Elemento eliminado: " + pila.pop());
        
        cola.add(300);
        cola.add(400);
        System.out.println("COLA");
        System.out.println("Elemento eliminado: " + cola.poll());
    }
    
}
