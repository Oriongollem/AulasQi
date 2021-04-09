/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoologico;

import java.util.Scanner;

/**
 *
 * @author Jeste
 */
public class Animal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        String especie;
        String cor;
        
        Mosca m = new Mosca();
        Papagaio p = new Papagaio();
        Cachorro c = new Cachorro();
        int opcao;
        
        
        do 
        {
        do 
        {
            System.out.println("Digite informações verdadeiras dos animais!");
            System.out.println("Cor do pelo do cachorro:");
            c.setCorPelo(ler.nextLine());
        
            System.out.println("cor da pena do papagaio:");
            p.setCorPena(ler.nextLine());
        
            System.out.println("quantidade de patas da mosca:");
            m.setQtdPatas(ler.nextInt());
            ler.nextLine();
            
            
        } 
        
        while (c.getCorPelo()== null || p.getCorPena() == null);
        
        if (m.getQtdPatas() == 6){
                System.out.println("Esta correto uma mosca tem 6 patas");
            }else{
                System.out.println("Esta incorreto uma mosca contem 3 pares de pernas!");
            }
            
        System.out.println("deseja tentar novamente ? se sim digite 1 se nao digite 0");
        opcao = ler.nextInt();
        
        } while (opcao == 1);
    }
}