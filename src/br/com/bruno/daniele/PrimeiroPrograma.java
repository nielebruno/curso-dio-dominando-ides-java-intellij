package br.com.bruno.daniele;
import br.com.bruno.daniele.*;
public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 2;
		int b = 3;
		Endereco Vo = new Endereco("Rua Caio Carlos",146);
		Endereco Eu = new Endereco("Avendia Washington Soares", 525, "apto 501");
		System.out.println("Taz odeia Java"+ (a+b));
		Vo.imprimir();
		Eu.imprimir();
		*/
		
		Cachorro Sherlock = new Cachorro();
		Sherlock.onde();
		Sherlock.anda(10);
		Sherlock.direita(90);
		Sherlock.anda(10);
		Sherlock.onde();
		Sherlock.onde();
		
		Sherlock.fala();
		
	}

}
