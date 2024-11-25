package exercicio2;

public class Circulo extends ElementoGeometrico implements CalculoGeometrico{
	
	private double raio;
	
	//no construtor precisa ter todos os dados (herdados e próprios)
	public Circulo(double x, double y, double raio) {
		super(x, y);
		this.raio = raio;
	}

	@Override
	public String desenhar() {
		return "O círculo está sendo desenhado...";
	}

	@Override
	public void redimensionar(double fatorDeRedimensionamento) {
		this.raio = raio * fatorDeRedimensionamento;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
}
