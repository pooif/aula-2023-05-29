// Superclasse Frete,
// Supertipo Frete,
// Frete genérico,

// Classe abstrata, incompleta, é obrigatório subtipá-la

import java.util.Date;

public abstract class Frete { // new Frete(); <- falha

  protected final double valorBase = 10.0;

  protected double getBase() { // método concreto/implementação
    return this.valorBase;
  }

  public final double getTaxa() {
    return 1.0;
  }

  // herança do comportamento

  // contrato // método com apenas assinatura
  // a subclasse é obrigada a implementar este método
  public abstract double calcularValor();
}


final class Teste {

}

// A classe Date não é final
class MinhaData extends Date {

}

// A classe String é final
// class MinhaString extends String {

// }

// public class Frete {

//   private Tipo tipo;
//   private Integer peso;
//   private Integer largura;
//   private Integer altura;
//   private Integer profundidade;
  
//   public enum Tipo {
//     SEDEX, PAC;
//   }

//   public Frete(Tipo tipo, Integer peso, Integer largura, Integer altura, Integer profundidade) {
//     this.tipo = tipo;
//     this.peso = peso;
//     this.largura = largura;
//     this.altura = altura;
//     this.profundidade = profundidade;
//   }

//   public Integer getAltura() {
//     return altura;
//   }

//   public Integer getLargura() {
//     return largura;
//   }

//   public Integer getProfundidade() {
//     return profundidade;
//   }

//   public Tipo getTipo() {
//     return tipo;
//   }

//   public Integer getPeso() {
//     return peso;
//   }

//   public Double calcularValor() {
//     if (tipo == null) {
//       return 10.0;
//     }
//     switch (tipo) {
//       case PAC: {
//         return 10.0 + 2 * getPeso();
//       }
//       case SEDEX: {
//         return 10.0 + ((largura * altura * profundidade) / 2);
//       }
//       default: return 10.0;
//     }
//   }

// }
