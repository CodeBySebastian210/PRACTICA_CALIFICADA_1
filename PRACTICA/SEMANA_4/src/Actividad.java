
public class Actividad {
    public static void main(String[] args) {
        int A[][] = {
            {1, 2},
            {3, 4}
        };
        int triangular[][] = {
            {1, 0, 0},
            {2, 3, 0},
            {4, 5, 6}
        };
        
        System.out.println("Matriz triangular (solo parte útil):");
        for (int i = 0; i < triangular.length; i++) {
            for (int j = 0; j <= i; j++) { // solo parte inferior
                System.out.print(triangular[i][j] + " ");
            }
            System.out.println();
        }        
    }   
}
