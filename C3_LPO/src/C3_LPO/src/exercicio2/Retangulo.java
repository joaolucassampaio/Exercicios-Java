package exercicio2;

public class Retangulo extends ElementoGeometrico implements CalculoGeometrico {
	
	private double lado1, lado2;
	
	public Retangulo(double x, double y, double lado1, double lado2) {
		super(x, y);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public String desenhar() {
		return "O retângulo está sendo redimensionado...";
	}

	@Override
	public void redimensionar(double fatorDeRedimensionamento) {
		this.lado1 = this.lado1 * fatorDeRedimensionamento;
		this.lado2 = this.lado2 * fatorDeRedimensionamento;
	}

	@Override
	public double area() {
		return this.lado1 * this.lado2;
	}

	@Override
	public double perimetro() {
		return 2*(this.lado1 * this.lado2);
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	
}
