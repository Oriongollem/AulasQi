
package Lacos_Array;

import java.util.Scanner;
import java.util.Arrays;

public class ArmazenarNumeros {

    public static void main(String[] args) {
        
        //Array
        
        Scanner in = new Scanner(System.in);
        
        double media = 0;
        int quantidade;
        
        System.out.println("Informe a quantidade de notas: ");
        quantidade = in.nextInt();
        
        double vetor[] = new double[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe a " + (i+1) + " Nota: ");
            vetor[i] = in.nextDouble();
        }
        
        for (int i = 0; i < quantidade; i++) {
            media = media + vetor[i];
        }
        
        media = media / quantidade;
        
        System.out.println("A média é: " + media);
        String maior = "Nota acima da média: " , menor = "Nota abaixo da Média";
        
        for (int i = 0; i < quantidade; i++) {
            if(vetor[i] > media){
                maior = maior + vetor[i] + "   ";
            }else{
                menor = menor + vetor[i];
            }
        }
        
        System.out.println(maior);
        System.out.println(menor);
        
    }
    
}
