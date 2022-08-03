package br.com.dio;

import br.com.dio.model.Cachorro;
import br.com.dio.model.Livro;


import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Cachorro sherlock = new Cachorro();
        sherlock.setNome("Sherlock");
        sherlock.setCor("Branca");
        sherlock.setIdade(3);
        System.out.println(sherlock);

        Livro livro1 = new Livro("Deitel",1000);
        System.out.println(livro1);



        /*Livro livro1 = new Livro(nome:"O problema dos 3 corpos", numPaginas:300);
        System.out.println(livro1);*/




    }
}
