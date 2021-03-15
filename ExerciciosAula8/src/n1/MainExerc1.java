/*1. Faça um programa que receba somente nºs positivos e exibe e calcule:
o número digitado
a soma dos números digitados
a quantidade de números digitados
a média dos números digitados*/

package n1;
import java.util.Scanner;

/**
 * @author Jeste
**/

public class MainExerc1 {
    
    public static void main(String[] args) {
    Calculos c = new Calculos();
    
    Scanner ler = new Scanner(System.in);
        int opcao;
        
        do 
        {
        do 
        {
            System.out.println("Digite dois numeros positivos!");
            c.setNumero1(ler.nextInt());
            c.setNumero2(ler.nextInt());
            
            if (c.getNumero1() < 0 || c.getNumero2() < 0){
                System.out.println("Os numeros digitados não são positivos");
            }
        } 
        
        while (c.getNumero1() < 0 || c.getNumero2() < 0);
        
        System.out.println("numero 1: " + c.getNumero1() + "\nnumero 2: "+ c.getNumero2());   
        System.out.println(""+c.verificarNumero());
            
        System.out.println("deseja caucular outros numeros se sim digite 1 se nao digite 0");
        opcao = ler.nextInt();
        
        } while (opcao == 1);
       
    
    }
}