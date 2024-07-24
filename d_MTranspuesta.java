package h_Matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

// Cargar una matriz de nxm y mostrar su transpuesta. 
public class d_MTranspuesta {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int numFil, numCol;

        numFil = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas"));
        numCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de Columnas"));

        int matriz[][] = new int[numFil][numCol];
        int matrizTrans[][] = new int[numCol][numFil];
        // Se solicita el ingreso de los elementos de la matriz
        for(int i=0; i<numFil; i++)
        {
            for(int j=0; j<numCol; j++)
            {
                System.out.print("["+i+"][" + j+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("---Matriz---");
        // Se muestra los elementos de la matriz
        for(int i=0; i<numFil; i++)
        {
            for(int j=0; j<numCol; j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        // Iteradores independiente para copiar los elementos en la matriz Trasnpuesta.
        int itFilas = 0;
        int itColumnas = 0;

        // Bucle para transponer la matriz
        // La matriz se recorre por columnas
        // La matriz transpuesta se recorre por filas. 
        for(int i=0; i<numFil; i++)
        {
            // Se reinicia el contador de filas
            itFilas = 0;
            for(int j=0; j<numCol; j++)
            {
                matrizTrans[itFilas][itColumnas] = matriz[i][j];
                // Se pasa a la siguiente fila de la matriz Transpuesta
                itFilas++;
            }
            // Se pasa a la siguiente columna de la matriz Transpuesta.
            itColumnas++;
        }

        System.out.println("---Matriz Transpuesta---");
        // Se muestra los elementos de la matriz transpuesta    
        for(int i=0; i<numCol; i++)
        {
            for(int j=0; j<numFil; j++)
            {
                System.out.print(matrizTrans[i][j] + " ");
            }
            System.out.println("");
        }
        entrada.close();
    }
}
