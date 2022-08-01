package br.com.bruno.daniele;

public class Endereco {
	String rua;
	int numero;
	String complemento;
	public Endereco(String nome, int numero, String complemento, String bairro, String cep, String cidade,
			String estado) {
		super();
		this.rua = nome;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public Endereco(String rua, int numero, String complemento, String bairro) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
	}

	public Endereco (String nome, int num)
	{
		this.rua = nome;
		this.numero = num;
	}
	public Endereco (String nome, int num, String comp)
	{
		rua = nome;
		numero = num;
		complemento = comp;
	}
	public void imprimir ()
	{
		if( complemento==null)
			System.out.println(rua+" nº"+ numero);
		else
			System.out.println(rua+" nº"+ numero+", "+complemento);
	}
	String bairro;
	String cep;
	String cidade;
	String estado;
	
}
