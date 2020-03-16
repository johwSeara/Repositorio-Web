package aula01;

public abstract class Espacial extends Figura {

	@Override
	double area() {

		return 0;
	}

	@Override
	double perimetro() {
	
		return 0;
	}
	
	abstract double volume();
	

}
