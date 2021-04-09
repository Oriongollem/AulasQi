
package TrabalhoEx10;

import java.util.Scanner;
import java.util.ArrayList;
import TrabalhoEx10.Produtos;

public class Carrinho {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Produtos produtos = new Produtos();
        
        ArrayList<Produtos> itens = new ArrayList<>();
        
        System.out.println("Cadastre seus produtos!");
        System.out.println("(para parar a execução, digite o código como 0)");
        
        do {
            System.out.println("Digite o codigo do produto: ");
            produtos.setCodigo(in.nextInt());
            if(produtos.getCodigo() != 0){
            System.out.println("Digite a descrição do produto: ");
            produtos.setDescProduto(in.nextLine());
            in.nextLine();
            System.out.println("Digite o preço do produto: ");
            produtos.setPreco(in.nextFloat());
            System.out.println("Digite a quantidade que deseja do produto: ");
            produtos.setQuantidade(in.nextInt());
            itens.add(produtos);
            }
        } while (produtos.getCodigo() != 0);
        
        System.out.println(itens);
        System.out.println(itens.size());
        
    }
    
}
