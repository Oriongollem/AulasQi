
package Exercicio3;

public class Cliente {
    
    private String nome;
    private int idade;
    private double renda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public String classificarIdade(){
        String resposta;
        if(idade < 18){
            resposta = "Cliente menor de idade.";
        }else{
            resposta = "Cliente maior de idade.";
        }
        return resposta;
    }
    
    public String classificarRenda(){
        String resposta;
        if(renda > 15000){
            resposta = "Cliente é Rico!!!";
        }else{
            resposta = "Cliente é pobre...";
        }
        return resposta;
    }
    
    public String toString(){
        return "Nome do cliente: " + this.nome +
                "\nIdade do Cliente: " + this.idade +
                "\nRenda do Cliente: " + this.renda +
                "\nConfirmação de dados...." +
                "\n" + this.classificarIdade() +
                "\n" + this.classificarRenda();
    }
    
}
