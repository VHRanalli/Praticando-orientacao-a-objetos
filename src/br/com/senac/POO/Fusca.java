package br.com.senac.POO;

/**
 * POO - Estudo Das Classes - Exemplo De Criação De Um Objeto
 * @author Victor Henrique Ranalli Barbosa
 */
public class Fusca {
    public static void main(String[] args) {
      //a linha abaixo cria ("instancia") um objeto tendo um modelo a classe Carro
      
      Carro fusquinha = new Carro();
      fusquinha.ano = 1968;
      fusquinha.cor = "azul";
      System.out.println("Carro: Fusca");
        System.out.println("cor: " + fusquinha.cor);
        System.out.println("Ano: " + fusquinha.ano);
        fusquinha.Acelerar();
        
        
    }
   
}
