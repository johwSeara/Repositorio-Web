package aula01;

public class Losango extends Poligono {

	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	double perimetro() {
		
		return 4 * (4 * getBase());
	}


}
