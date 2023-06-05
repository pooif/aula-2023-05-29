
public class Expresso extends Frete {

  private int hora;

  public Expresso(int hora) {
    this.hora = hora;
  }

  public int getHora() {
    return hora;
  }

  @Override
  public double calcularValor() {
    return super.valorBase + (hora == 12 ? 10 : 5);
  }

}
