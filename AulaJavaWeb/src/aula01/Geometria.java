package aula01;

import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
	
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		//figuras.add(new Circulo());
		figuras.add(new Quadrado(8,10));
		figuras.add(new Triangulo(6,8));
		figuras.add(new Losango(6,8));
		figuras.add(new Retangulo(10,15));
		
		for (Figura f: figuras) {
			
			System.out.println("Área: " + f.area());
			System.out.println("Perímetro: " + f.perimetro());
			
			if(f instanceof Diagonal) {
				System.out.println("Diagonal:");
				System.out.println(((Diagonal)f).calculaDiagonal());
			}
			
		}
	}
}
