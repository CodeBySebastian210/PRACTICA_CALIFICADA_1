
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
            for (int j = 0; j <= i; j++) { 
                System.out.print(triangular[i][j] + " ");
            }
            System.out.println();
        }

        int B[][] = {
            {5, 6},
            {7, 8}
        };

        int suma[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                suma[i][j] = A[i][j] + B[i][j];
            }
        }

        int mult[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mult[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    mult[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        int transpuesta[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpuesta[j][i] = A[i][j];
            }
        }
        
        System.out.println("\nSuma:");
        mostrar(suma);

        System.out.println("\nMultiplicación:");
        mostrar(mult);

        System.out.println("\nTranspuesta:");
        mostrar(transpuesta);        
    }
    
    public static void mostrar(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
