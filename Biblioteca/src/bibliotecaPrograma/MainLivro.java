
/*Jackson*/
package bibliotecaPrograma;

import java.util.Scanner;
public class MainLivro {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Livro c1 = new Livro();
        
        
        System.out.println("Nome o Titulo do Livro:");
        c1.setTitulo(ler.nextLine());
        
        System.out.println("Digite o nome do autor:");
        c1.setAutor(ler.nextLine());
        
        System.out.println("Digite o Genêro do Livro:");
        c1.setGenero(ler.nextLine());
        
        System.out.println("Digite o ano do livro:");
        c1.setAno(ler.nextInt());
        
        System.out.println("Digite o valor do Livro:");
        c1.setValor(ler.nextDouble());
        
        
        System.out.println("*****************************");
        System.out.println("Executando leitura de dados...");
        System.out.println("*****************************");
        
        System.out.println("O Titulo do livro é " + c1.getTitulo());
        System.out.println("O nome do Autor é " + c1.getAutor());
        System.out.println("O Genêro do livro é" + c1.getGenero());
        System.out.println("O ano do livro é " + c1.getAno());
        System.out.println("O valor do livro é " + c1.getValor());
        
        System.out.println(c1.verificarValor());
    }
    
    
    
}
