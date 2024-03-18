
package trabajoPractico;

import java.util.Scanner;

import trabajoPractico.cuentas.CCuenta;

public class Main {

	
    public static void main(String[] args) {
        operativa_cuenta();
    }

	private static void operativa_cuenta() {
			CCuenta cuenta1;
	       //  CCuenta otraCuenta;
	        double saldoActual; // 0.0
	    
	        cuenta1  = new CCuenta("antonio lopez","1000-2365-85-1230456789",2500,0); // crean el objeto, a partir del constructor
	        // otraCuenta = new CCuenta(); // aqui utilizo el constructor vacio
	        saldoActual = cuenta1.estado(); // saldo actual se carga con el valor del atributo saldo del objeto cuenta1. 
	        System.out.println("El saldo actual es "+ saldoActual );

	        try {
	            cuenta1.retirar(2700);
	        } catch (Exception e) {
	        	System.out.println(e.getMessage());
	            System.out.println("Fallo al retirar");
	        }
	        
	        try {
	            System.out.println("Ingreso en cuenta");
	            cuenta1.ingresar(695);
	        } catch (Exception e) {
	            System.out.println("Fallo al ingresar");
	        }
	        
		
	}
}
