
package Exercicio2;

import java.util.Scanner;

public class ValoresReais {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double numero1, numero2;
        
        System.out.println("Digite o primeiro número: ");
        numero1 = in.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = in.nextDouble();
        
        if(numero1 == numero2){
            System.out.println("Números iguais! :o");
        }else{
            System.out.println("Números diferentes! :)");
        }
        
    }
    
}
