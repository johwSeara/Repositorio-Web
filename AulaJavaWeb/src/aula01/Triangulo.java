package aula01;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
		
	}

	@Override
	double area() {
	
		return (getBase() * getAltura() / 2);
	}

	@Override
	double perimetro() {
		
		return 0;
	}

}
