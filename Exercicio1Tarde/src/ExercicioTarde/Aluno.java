
package ExercicioTarde;
import java.util.Scanner;
public class Aluno {
    
    public static void main(String[] args) {
        
        String nome;
        double nota1, nota2, nota3, media;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o nome do Aluno:");
        nome = in.nextLine();
        
        System.out.println("Digite a primeira nota:");
        nota1 = in.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        nota2 = in.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        nota3 = in.nextDouble();
        
        media = (float) (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Nome do Aluno : " + nome);
        System.out.println("Nota 1 do Aluno : " + nota1);
        System.out.println("Nota 2 do Aluno : " + nota2);
        System.out.println("Nota 3 do Aluno : " + nota3);
        System.out.println("Média Aritmética do Aluno : " + media);
    }
    
}
