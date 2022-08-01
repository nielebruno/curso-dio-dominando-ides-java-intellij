package br.com.bruno.daniele;

public class Cachorro 
{
	//Atributos do objeto cachorro
	private double x;
	private double y;
	private float direcao;
	
	//Construtor padrão do cachorro: Inicia o objeto
	public Cachorro()
	{
		x = 0;
		y = 0;
		direcao = 0;
		
	}
	// isso equivale a fazer variavel = objeto.x = objeto.getX()
	public double getX() {
		return x;
	}
    
	// isso equivale a fazer objet.x = valor
	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public float getDirecao() {
		return direcao;
	}

	public void setDirecao(float direcao) {
		this.direcao = direcao;
	}

	//Métodos que manipulam os atributos
	public void anda(int quantidade)
	{
	//Método de Entrada que modifica a posição
		x = x+ quantidade*Math.cos(direcao*Math.PI/180);
		y = y+ quantidade*Math.sin(direcao*Math.PI/180);
	}
	public void direita(float angulo)
	{
		//Método de entrada que modifica a posição
		direcao += angulo;
	}
	public void esquerda(float angulo)
	{
		//Método de entrada que modifica a posição
		direcao -= angulo;
	}
	
	public void fala() 
	{
		//Método de saída
		System.out.println("au au!");
	}
	
	public void onde()
	{
		//Método de saída
		System.out.println("x="+x+" y="+y);
	}
}

