/*Jackson*/
package bibliotecaPrograma;


public class Livro {
    public String titulo;
    public String autor;
    public double valord;
    private String genero;
    private int ano;
    private double valor;
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String verificarValor() {
        String resposta;
        if (this.valor > 80) {
            valord = 0.20;
            valord = valor-(valord * valor);
            resposta = "O Valor do seu livro é: " + valor + " por isso você recebe um desconto de 20% e fica:" + valord;
            
        }else {
            resposta = "Valor do livo é: " + valor;
        }
        return resposta;
    }
    
}
