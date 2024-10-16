package Utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncoesUteis {
    
    // metodo que soma dois numeros inteiros
    public int Soma(int a, int b) {
        return a + b;
    }

    // metodo que exibi um triangulo de certa altura 
    public void Triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    // metodo que le e imprimi um conteudo de um arquivo 
    public void printArquivo(String arquivo) {
    	
        // tentativa que abrir e le o arquivo usando bufferedReader e fileReader
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            
            // String que armazena a linha do arquivo
            String linha;
            
            // loop para ler cada linha do arquivo até chegar ao final (quando null)
            while ((linha = br.readLine()) != null) {
                // aparece a linha no console
                System.out.println(linha);
            }
            
        // aparece qualquer exceção de I/O
        } catch (IOException e) {
            // exibe uma mensagem de erro se acontecer algum problema
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } 
    }
}