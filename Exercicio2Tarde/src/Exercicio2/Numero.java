
package Exercicio2;

//criando o import do Scanner
import java.util.Scanner;

//inicio da classe numero
public class Numero {

    //inicio da classe principal
    public static void main(String[] args) {

        //instanciando o Scanner
        Scanner in = new Scanner(System.in);

        //declarando as variaveis
        int numero;
        
        System.out.println("Digite um número inteiro para saber se é par ou impar: ");
        numero = in.nextInt();
        
        if(numero%2 == 0){
            System.out.println("O número é par!");
        }else{
            System.out.println("O número é impar!");
        }
        
    }
    
}
