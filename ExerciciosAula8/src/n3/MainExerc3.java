/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n3;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Jeste
 */
public class MainExerc3 {
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("*********** COMPARAÇÂO DE IDADE COM TEMPO ***********");
        System.out.println("Digite o nome das pessoas das quais quer comparar a altura: ");
        p.nome1 = ler.nextLine();
        p.nome2 = ler.nextLine();
        
        System.out.println("nome digitado: " + p.nome1);
        System.out.println("nome digitado: " + p.nome2);
        
        System.out.println("Digite a altura das pessoas");
        p.altura1 = ler.nextDouble();
        p.altura2 = ler.nextDouble();
        
        System.out.println("Altura digitada: " + p.altura1);
        System.out.println("Altura digitada: " + p.altura2);
        
        System.out.println("Digite quantos cm por ano o(a)" + p.nome1 + " cresce");
        p.cmPAno1 = ler.nextDouble();
        System.out.println("Digite quantos cm por ano o(a)" + p.nome2 + " cresce");
        p.cmPAno2 = ler.nextDouble();
        
        System.out.println("Digite o ano atual: ");
        p.ano = ler.nextInt();
        System.out.println("Digite o ano Estimado: ");
        p.anoEstimado = ler.nextInt();
        
        System.out.println("ano digitado: " + p.ano);
        System.out.println("ano estimado digitado: " + p.ano);
        
        System.out.println(p.compararIdades());
    }        
}
