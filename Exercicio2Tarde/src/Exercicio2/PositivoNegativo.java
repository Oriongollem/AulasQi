
package Exercicio2;

import java.util.Scanner;

public class PositivoNegativo {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um número para checar se é positivo ou negativo: ");
        numero = in.nextInt();
        
        if(numero >=0){
            System.out.println("Número Positivo");
        }else{
            System.out.println("Número Negativo");
        }
        
    }
    
}
