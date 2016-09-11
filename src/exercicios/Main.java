/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author mateus
 */

public class Main {

	public static void main(String[] args){
		
		Livraria livro1 = new Livraria("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
		Livraria livro2 = new Livraria("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		Livraria livro3 = new Livraria("Pat Conroy", "Beach Music", 9.50, 1996 );
		
                        
		System.out.println(livro1.toString());
                System.out.println(livro2.toString());
                System.out.println(livro3.toString());
		
	
		
	}
	
}

