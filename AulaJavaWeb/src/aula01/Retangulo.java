package aula01;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double base, double altura) {
		super(base, altura);
		
	}

	@Override
	public double calculaDiagonal() {
		
		return Math.sqrt(getBase() * getAltura()) + (getBase() * getAltura());
	}

	@Override
	double perimetro() {
		
		return (getBase() + getAltura()) * 2;
	}

}
