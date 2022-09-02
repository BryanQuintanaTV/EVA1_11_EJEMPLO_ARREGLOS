/*
 * "
 * "
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PracticaClase {

    public static void main(String[] args) {
       /* Pedir número de grupos
          Pedir número de estudiantes por grupo
          Capturar calificaciones
          Imprimir calificaciones */
        int arregloCali[][];
        //Primer dimensión - Grupos
        //Segunda dimendión -- estudiantes x grupo
        //DETERMINAR LOS GRUPOS
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número de grupos: ");
        int iGpos = input.nextInt();
        arregloCali = new int[iGpos][];
        
        //PARA CADA GRUPO: CÚANTOS ESTUDIANTES NECESITAS?
        for (int i = 0; i < arregloCali.length; i++) {
            System.out.println("Cuántos estudiantes hay en el grupo "+(i+1));
            int iEstu = input.nextInt();
            arregloCali[i] = new int[iEstu];
        }
        
        
    }
    
}
