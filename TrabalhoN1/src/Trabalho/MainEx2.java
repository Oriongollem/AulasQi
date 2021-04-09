package Trabalho;

import java.util.Scanner;
import Trabalho.ProdutoEx2;

public class MainEx2 {

    public static void main(String[] args) {
        
        Scanner in =  new Scanner(System.in);
        ProdutoEx2 produto = new ProdutoEx2();
        
        System.out.println("Digite o nome do produto: ");
        produto.nome = in.nextLine();
        System.out.println("Digite o valor do produto: ");
        produto.valor = in.nextDouble();
        
        System.out.println(produto);
        
    }
    
}

