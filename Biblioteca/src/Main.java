
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operacao;
        Scanner ler = new Scanner(System.in);

        
        Livro l1 = new Livro();
        Cliente c1 = new Cliente();
        
        System.out.println("Escolha uma operação: 1 - cadastro de cliente, 2 - venda de livro  , 3");
        operacao = ler.nextLine().charAt(0);
        System.out.println("***************************************");
        /*iniciando o switch case
        */
        switch (operacao)
        {
            case '1':
                System.out.println("********* Cadastro de cliente *********");
                
                System.out.println("Digite o nome do cliente: ");
                c1.nome = ler.nextLine();
                System.out.println("Digite a idade do cliente: ");
                c1.idade = ler.nextInt();
                ler.nextLine();
                System.out.println("Digite o cpf do cliente: ");
                c1.setCpf(ler.nextLine());
                System.out.println("***************************************");
                System.out.println("Cadatro concluido com sucesso \n");
                break;
                
            case '2':
                System.out.println("********* Compra de livro *********");
                
                System.out.println("Digite o titulo do livro: ");
                l1.titulo = ler.nextLine();
                System.out.println("Digite o genero do livro: ");
                l1.genero = ler.nextLine();
                System.out.println("Digite o id do livro: ");
                l1.id = ler.nextInt();
                System.out.println("Digite o valor do livro: ");
                l1.setValor(ler.nextDouble());
                System.out.println("***************************************");
                System.out.println("O valor da compra do livro escolhido é: " + l1.verificarPreco());
                break;               
        }
        
               
        
        
        




    
}
}
