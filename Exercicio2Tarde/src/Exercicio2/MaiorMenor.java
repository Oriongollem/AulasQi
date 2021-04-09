
package Exercicio2;

import java.util.Scanner;

public class MaiorMenor {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double numero1, numero2;
        
        System.out.println("Digite o primeiro: ");
        numero1 = in.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = in.nextDouble();
        
        if(numero1 > numero2){
            System.out.println("O primeiro número é maior que o primeiro!");
        }else if(numero1 < numero2){
            System.out.println("O segundo número é maior que o primeiro!");
        }else{
            System.out.println("Os dois números são iguais!");
        }
        
    }
    
}
