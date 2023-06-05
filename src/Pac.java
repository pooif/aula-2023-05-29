public class Pac extends Frete {

  private int peso;

  public Pac(int peso) {
    this.peso = peso;
  }

  // @Override
  // public double getTaxa() {
  //   return 2.0;
  // }

  public int getPeso() {
    return peso;
  }

  @Override
  public double calcularValor() {
    return super.valorBase + 2 * peso;
  }

  // // @Override // sobrescrita /Tudo que inicia com @ é uma annotation
  // @Override
  // public double calcularValor() {
  //   // compondo o algoritimo com partes do super tipo
  //   return super.calcularValor() + 2 * peso;
  // }
}
