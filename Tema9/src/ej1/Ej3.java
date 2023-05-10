package ej1;

import java.util.HashSet;
import java.util.Scanner;

/*Repite la actividad 2 
 * de forma que se inserten los nombres manteniendo el orden alfabético.*/
public class Ej3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		HashSet<String> nombres= new HashSet<String>();
		
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
