/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5.ejer.prop.pkg5;
import java.util.Scanner;
/**
 *
 * @author Aaron Garcia Gonzalez
 */
public class T5EjerProp5 {

    /**
     * @param args the command line arguments
     */
    static int diferencia(int hora1, int minuto1, int hora2, int minuto2){//primero se crea la funcion con las operaciones pertinentes
        int diferencia = 0;
        minuto1 = minuto1 + (hora1*60);
        minuto2 = minuto2 + (hora2*60);
        if (minuto1>minuto2){
            diferencia = minuto1 - minuto2;
        } else if (minuto1<minuto2){
            diferencia = minuto2 - minuto1;
        }
        return diferencia;
    }
    public static void main(String[] args) {//se crean las variables y las entradas de datos y se llama a la funcion
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);
        int hora1, hora2, minuto1, minuto2;
        System.out.println("Introduzca Horas y minutos");
        hora1 = sc.nextInt();
        minuto1 = sc.nextInt();
        System.out.println("Introduzca Horas y minutos");
        hora2 = sc.nextInt();
        minuto2 = sc.nextInt();
        int d = diferencia(hora1, minuto1, hora2, minuto2);
        System.out.println(d);
    }
    
}
