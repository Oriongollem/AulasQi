
package ExercicioTarde;
import java.util.Scanner;
public class Circulo {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double raio, diametro, quadrante, pi;
           
        System.out.println("Digite um raio de um círculo: ");
        raio = in.nextDouble();
        
        pi = 3.14;
        diametro = 2*raio*pi;
        quadrante = diametro*0.25;
        
        
        System.out.println("Raio digitado: " + raio);
        System.out.println("Diâmetro do Circulo: " + diametro);
        System.out.println("Valor de um quadrante do Circulo: " + quadrante);
    }
}
