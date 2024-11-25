package exercicio2;

public interface CalculoGeometrico {
	//em uma interface, m�todos sem corpo s�o, por padr�o, abstratos
	//ou seja, n�o � necess�rio usar a palavra reservada "abstract"
	public String desenhar();
	public void redimensionar(double fatorDeRedimensionamento);
	public double area();
	public double perimetro();
}
