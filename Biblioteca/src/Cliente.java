public class Cliente {
    public String nome;
    public int idade;
    private String cpf;

    public Cliente(){
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return "Dados do Cliente" + "\n" 
                + "O nome do cliente: " + this.nome + "\n"  
                + "O idade do cliente: " + this.idade + "\n"
                + "O CPF do cliente: " + this.cpf;
    }
    
}
