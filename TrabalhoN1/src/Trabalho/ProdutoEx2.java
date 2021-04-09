
package Trabalho;

public class ProdutoEx2 {
    
    String nome;
    double valor;
    
    
    public double calcularDesconto(){
        return this.valor * 0.025;
    }
    
    public String toString(){
        return "Nome do produto: " + this.nome +
                "\nValor do produto: " + this.valor +
                "\nDesconto de 2,5%: " + this.calcularDesconto();
    }
    
}
