/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n2;
import java.util.Scanner;

/**
 *
 * @author Jeste
 */

import java.util.ArrayList;
public class MainExerc2 {
    public static void main(String[] args){
        
        Calculos c = new Calculos();
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        /*            
            System.out.println("Digite numeros ao digitar 0 os numeros digitados serão somados");
            numeros.add(c.numero = ler.nextInt());
            System.out.println("O array é: " + numeros);
        */
        
        do 
        {
            System.out.println("Digite numeros ao digitar 0 os numeros digitados serão somados!");
            c.setNumero(ler.nextInt());
            
            if (c.getNumero() != 0){
                numeros.add(c.getNumero());
            }
       } 
        
        while (c.getNumero() != 0);
        int soma = 0;
        for (Integer n : numeros) {
        soma += n.intValue();
        }
        
        /*for (int i = 0 ; i < numeros.size() ; i++) {
            soma += numeros[i];
            
        }*/
        
        /*for int i=0; i<tamanho do seu array; i++) {
        soma+=seuArray[i];
        }*/
        
        System.out.println("O array é: " + numeros);
        System.out.println("A soma dos elementos do array é: " + soma);
    }
}
