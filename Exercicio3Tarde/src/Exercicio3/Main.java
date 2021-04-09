
package Exercicio3;

import java.util.Scanner;
import Exercicio3.Cliente;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Cliente cliente = new Cliente();
        
        System.out.println("Digite o nome do cliente: ");
        cliente.setNome(in.nextLine());
        
        System.out.println("Digite a idade do cliente: ");
        cliente.setIdade(in.nextInt());
        
        System.out.println("Digite a renda do cliente: ");
        cliente.setRenda(in.nextDouble());
        
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("Idade do Cliente: " + cliente.getIdade());
        System.out.println("Renda do Cliente : " + cliente.getRenda());
        System.out.println("----------Classificação de dados do Cliente----------");
        System.out.println(cliente.classificarIdade());
        System.out.println(cliente.classificarRenda());
        
    }
    
}
