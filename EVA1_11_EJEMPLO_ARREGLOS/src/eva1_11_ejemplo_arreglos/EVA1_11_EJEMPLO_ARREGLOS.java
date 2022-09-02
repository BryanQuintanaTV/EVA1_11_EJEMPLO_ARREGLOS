/*
 * "Evaluación 1 Practica 11 "Ejemplo arreglos"
   "Pedir número de grupos
    Pedir número de alumnos por grupo
    Capturar calificaciones"
 */

package eva1_11_ejemplo_arreglos;
import java.util.Scanner;

/**
 * @author Bryan Alexis Quintana Juarez
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    public static void main(String[] args) {
        
        int arregloCalif[][];
        
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántos grupos hay?");
        int numGrupos = leer.nextInt();
        arregloCalif = new int[numGrupos][];       
        
        for (int i = 0; i < arregloCalif.length; i++) {
            System.out.println("¿Cúantos alumnos hay en el grupo " +(i+1));
            int numAlumn = leer.nextInt();
            arregloCalif[i] = new int[numAlumn];
            
            for (int j = 0; j < arregloCalif[i].length; j++) {
                System.out.println("Introduzca la calificación del alumno: "+(j+1));
                int calif = leer.nextInt();
                arregloCalif[i][j] = calif;
            }
        }
        
        
        for (int i = 0; i < arregloCalif.length; i++) {
            System.out.println("Grupo: #"+(i+1));
            for (int j = 0; j < arregloCalif[i].length; j++) {
                System.out.println(" Alumno: "+(j+1)
                                            +" Calificacón: "+arregloCalif[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
