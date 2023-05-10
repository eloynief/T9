package ej1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ej2 {
/*Introduce por teclado, 
 * hasta que se introduzca “fin”, 
 * una serie de nombres, que se insertarán en una colección, 
 * de forma que se conserve el orden de inserción y que no puedan repetirse. 
 * Al final, la colección se mostrará por pantalla*/
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//si dice orden de inserción y que no tiene duplicados,es un linkedhashset
		LinkedHashSet<String> nombres= new LinkedHashSet<String>();
		
		String nombre="";
		
		System.out.println("Introduce nombres");
		while (!nombre.equals("fin")){
			
			nombre=sc.next();
			
			if(!nombre.equals("fin")){
			nombres.add(nombre);
			nombres.toArray();
			nombres.size();
			}
		}
		
		
		
		System.out.println(nombres);
		
		
		
	}

}
