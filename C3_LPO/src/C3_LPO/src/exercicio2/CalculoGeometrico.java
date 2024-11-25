package exercicio2;

public interface CalculoGeometrico {
	//em uma interface, métodos sem corpo são, por padrão, abstratos
	//ou seja, não é necessário usar a palavra reservada "abstract"
	public String desenhar();
	public void redimensionar(double fatorDeRedimensionamento);
	public double area();
	public double perimetro();
}
