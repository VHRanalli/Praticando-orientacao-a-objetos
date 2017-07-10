package br.com.senac.POO;

/**
 *
 * @author victor.hrbarbosa
 */
public class Ferrari {
    public static void main(String[] args) {
      Carro ferrari = new Carro();
      ferrari.ano = 2012; 
      ferrari.cor = "vermelho";
        System.out.println("Carro: Ferrari");
        System.out.println("Cor: " + ferrari.cor);
        System.out.println("Ano: " + ferrari.ano);
        ferrari.Acelerar(); 
    }  
}
