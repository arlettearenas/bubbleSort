/*
Ordenamiento: Método Burbuja 
 */
package bubblesort;

/**
 *@author arlet
 */
import java.util.Scanner; 
import javax.swing.JOptionPane;

public class BubbleSort {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int arreglo[], nElementos, aux;
       
       nElementos = Integer.parseInt(JOptionPane.showInputDialog("Escriba el número deseado del arreglo"));
       
       arreglo = new int[nElementos]; //Le asignamos el número de elementos al arreglo
       
       for (int i=0;i<nElementos;i++){
           System.out.println((i+1)+ ". Digite un número: ");
           arreglo[i] = entrada.nextInt();
         }
       
       //Método Burbuja
       
       for(int i = 0; i < (nElementos-1);i++){
           for(int j=0;j<(nElementos-1); j++){
               if(arreglo[j]>arreglo[j+1]){ //Si numeroActual > numeroSiguiente
                 aux = arreglo[j];
                 arreglo[j] = arreglo [j+1];
                 arreglo[j+1] = aux;
               }
           }
           
       }
       
       //Mostrando el arreglo ordenado en forma creciente
        System.out.print("\nArreglo ordenado en forma creciente: ");
       for (int i = 0; i < nElementos; i++){
           System.out.print(arreglo[i]+ ", ");
       }
        System.out.println("\nArreglo ordenado en forma decreciente:");
        for (int i = (nElementos-1);i>=0;i--){
             System.out.print(arreglo[i]+ ", ");
        }
        System.out.println("");
    }
    
}
