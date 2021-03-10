/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

import java.util.Scanner;

/**
 *
 * @author Cristina Jung
 */
public class MainLivro {

    public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Digite o nome do Livro:");
        String titulo = ler.nextLine();
        
        System.out.println("Digite o autor do livro:");
        String autor = ler.nextLine();
        
        System.out.println("Digite o gênero do Livro:");
        String genero = ler.nextLine();
        
        System.out.println("Digite o ano do Livro: ");
        int ano = ler.nextInt();
        
        System.out.println("Digite o preço do Livro: ");
        double preco = ler.nextDouble();
        
        Livro li = new Livro(titulo,autor,genero,ano,preco);
        
        System.out.println("**************************");
        //a main acessa o método toString
        System.out.println(li);        
        System.out.println("O preço da compra é: " + li.verificarPreco());
        
    }
    
}
    
    

