
package Lacos_Array;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class NomesPessoas {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Gravando dados no ArrayList com a Classe Scanner");
        System.out.println("Instrução: Digite 0 quando desejar finalizar a lista.");
        
        //declaração de dados
        
        for (int i = 0; i < 15;) {
            System.out.println("Digite um número para inserir na lista: ");
            int num1 = in.nextInt();
            
            if(num1 == 0){
                break;
            }            
            numeros.add(num1);
        }
        
    }
    
}
