
package TrabalhoEx10;

import java.util.ArrayList;

public class Produtos {
    
    
    private int codigo;
    private String descProduto;
    private float preco;
    private int quantidade;

    public Produtos() {
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void listarDados(int codigo, String descProduto, float preco, int quantidade){
        this.codigo = codigo;
        this.descProduto = descProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
}
