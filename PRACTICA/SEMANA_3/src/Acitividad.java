
public class Acitividad {
    public static void main(String[] args) {
        int arreglo1[] = {10, 20, 30};
        int arreglo2[] = {10, 20, 30};
        
        boolean sonIguales = true;        
        if (arreglo1.length != arreglo2.length) {
            sonIguales = false;
        } else {
            for (int i = 0; i < arreglo1.length; i++) {
                if (arreglo1[i] != arreglo2[i]) {
                    sonIguales = false;
                    break;
                }
            }
        }
        System.out.println("¿Los arreglos son iguales? " + sonIguales);
        
        int clon[] = new int[arreglo1.length];
        for (int i = 0; i < arreglo1.length; i++){
            clon[i] = arreglo1[1];
        }
        
        int fusion[] = new int[arreglo1.length + arreglo2.length];
        for (int i = 0; i < arreglo1.length; i++){
            fusion[i] = arreglo1[i];
        }
        for (int i = 0; i < arreglo2.length; i++){
            fusion[arreglo1.length + i] = arreglo2[i];
        }
        
        System.out.println("\nArreglo clon:");
        for (int i = 0; i < clon.length; i++){
            System.out.print(clon[i] + " ");
        }
        
        System.out.println("\n\nArreglo fusion:");
        for (int i = 0; i < fusion.length; i++){
            System.out.print(fusion[i] + " ");
        }
    }   
}
