/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpeveris;

/**
 *
 * @author Alumno
 */
public class TpEveris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multi = new Multiplicacion();
        Division div = new Division();
        System.out.println("La suma es: " + suma.operacion(2, 3));
        System.out.println("La resta es: " + resta.operacion(2, 3));
        System.out.println("La multiplicaciòn es: " + multi.operacion(2, 3));
        System.out.println("La division es: " + div.operacion(2, 3));
        
        
        Potencia pot = new Potencia();
        Raiz raiz = new Raiz();
    }
    
}
