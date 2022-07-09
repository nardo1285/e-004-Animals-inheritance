package Atributes;

public final class Gato extends Animal {

  private String maullido;

  public Gato(String name, String food, Integer age, String race, String maullido) {
    super(name, food, age, race);
    this.maullido = maullido;
  }

  public String getMaullido() {
    return maullido;
  }

  public void setMaullido(String maullido) {
    this.maullido = maullido;
  }

  @Override
  public void alimentarse(){
    System.out.println("El gato se alimenta de "+ this.getFood());
  }

}
