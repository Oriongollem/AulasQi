
package ExercicioTarde;
import java.util.Scanner;
public class Numero {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double a, dobro, triplo, metade, quadrado, quintaParte;
        
        System.out.println("Digite um núero que tomará o lugar de 'A' ");
        a = in.nextDouble();
        
        dobro = (float) a*2;
        triplo = (float) dobro*3;
        metade = (float) triplo/2;
        quadrado = (float) Math.pow(a, 2);
        quintaParte = (float) dobro/5;
        
        System.out.println("Número 'A': " + a);
        System.out.println("Dobro do núero A: " + dobro);
        System.out.println("Triplo do Dobro de A: " + triplo);
        System.out.println("Metade do triplo do dobro de A: " + metade);
        System.out.println("Quadrado de A: " + quadrado);
        System.out.println("A quinta parte do dobro de A: " + quintaParte);
    }
}
