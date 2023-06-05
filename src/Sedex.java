public class Sedex extends Frete {

  private int largura;
  private int altura;
  private int profundidade;

  public Sedex(int largura, int altura, int profundidade) {
    this.largura = largura;
    this.altura = altura;
    this.profundidade = profundidade;
  }

  public int getLargura() {
    return largura;
  }

  public int getAltura() {
    return altura;
  }

  public int getProfundidade() {
    return profundidade;
  }

  @Override
  public double calcularValor() {
    return this.valorBase + ((largura * altura * profundidade) / 2);
  }
  
}
