public class Livro {
    
    public String titulo,genero;
    public int id;
    private double valor;
    
    public Livro(){
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double verificarPreco() {
        if(this.valor >= 80) {
            valor = (valor - (valor * 0.2));
        }else{
            valor = valor;
        }
        return valor;
    }
    
    @Override
    public String toString() {
        return "Dados do Livro" + "\n" 
                + "O título do Livro: " + this.titulo + "\n"  
                + "O gênero do Livro: " + this.genero + "\n"
                + "O gênero do Livro: " + this.id + "\n"
                + "O preço do Livro: " + this.valor;
    }
    
    
    
}
