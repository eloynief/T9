package ej1;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int random=0;
		
		
		//pensar como si fuera un array
		//I don't know how to use this
		TreeSet<Integer> numeros= new TreeSet<Integer>();
		
		for(int i=0;i<=20;i++) {
			//añade el número 5
			random=((int) (Math.random()*100));
			numeros.add(random);

			numeros.toArray();
			numeros.size();
		}
		System.out.println(numeros);
		
		
		
		
		
		
		
		/*Aplicacion<Integer> numero= new Aplicacion<Integer>();*/
		
		
		
		
		
		
	}

}
