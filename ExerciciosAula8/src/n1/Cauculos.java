package n1;


public class Cauculos {
    public String resposta;
    private int numero1;
    private int numero2;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1( int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
    public String verificarNumero(){
        if (numero1 > 0 && numero2 > 0){
            double soma = numero1 + numero2;
            int quant = numero1 / numero1 + numero2 / numero2 ;
            
            resposta = "****** Realizando as operações ******\n"
            + "soma: " + soma
            + "\nquantidade de numeros digitados: " + quant
            + "\nmedia dos numeros digitados: " + soma/quant;
        }else{
            resposta = "O numero digitado não é positivo favor digitar um numero positivo!";
        }
        return resposta;
    }
    
}