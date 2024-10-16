package Main;

import Utilidades.FuncoesUteis;

public class Main {
	
    public static void main(String[] args) {
        FuncoesUteis funcoes = new FuncoesUteis();

        // o metodo da soma
        
        int resultadoSoma = funcoes.Soma(5, 4);
        System.out.println("Resultado da Soma: " + resultadoSoma);

        //  metodo triangulo
        
        System.out.println("Triângulo de altura 5:");
        
        //  funcao triangulo para aparecer o triangulo na tela
        funcoes.Triangulo(3);

        //  metodo printArquivo
        System.out.println("Conteúdo do arquivo:");
        
        //  funcao printArquivo para exibir o texto do arquivo 
        funcoes.printArquivo("C:/Users/Nicolas/eclipse-workspace/Triangulo/src/teste.txt");

    }
}
