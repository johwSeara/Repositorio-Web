package aula01;

public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double base, double altura) {
		super(base, altura);
		
	}

	@Override
	public double calculaDiagonal() {
	
		return Math.sqrt(getBase() * getAltura()) + (getBase() * getAltura());
	}

	@Override
	double perimetro() {
		
		return getBase() * 4;
	}

}
