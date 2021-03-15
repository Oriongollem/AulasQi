/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n3;

/**
 *
 * @author Jeste
 */
public class Pessoa {
    public String nome1;
    public String nome2;
    public int ano;
    public int anoEstimado;
    public Double altura1;
    public Double altura2;
    public String resposta;
    public Double cmPAno1;
    public Double cmPAno2;
    
    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getAltura1() {
        return altura1;
    }

    public void setAltura1(Double altura1) {
        this.altura1 = altura1;
    }

    public Double getAltura2() {
        return altura2;
    }

    public void setAltura2(Double altura2) {
        this.altura2 = altura2;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Double getCmPAno1() {
        return cmPAno1;
    }

    public void setCmPAno1(Double cmPAno1) {
        this.cmPAno1 = cmPAno1;
    }
    
    public Double getCmPAno2() {
        return cmPAno2;
    }

    public void setCmPAno2(Double cmPAno2) {
        this.cmPAno2 = cmPAno2;
    }

    public int getAnoEstimado() {
        return anoEstimado;
    }

    public void setAnoEstimado(int anoEstimado) {
        this.anoEstimado = anoEstimado;
    }
    

    
    public String compararIdades(){
        
            altura1 = altura1 * (anoEstimado - ano);
            altura2 = altura2 * (anoEstimado - ano);
            
            resposta = "A altura do " + nome1 +" em " + anoEstimado + " será " + altura1 + " A altura do " + nome2 +" em " + anoEstimado + " será " + altura2;
        
    return resposta;
    }
    
    
    
}
