package Atributes;

public class Perro extends Animal {

  private String ladrido;

  public Perro(String name, String food, Integer age, String race, String ladrido) {
    super(name, food, age, race);
    this.ladrido = ladrido;
  }

  public String getLadrido() {
    return ladrido;
  }

  public void setLadrido(String ladrido) {
    this.ladrido = ladrido;
  }

  @Override
  public void alimentarse() {
    System.out.println("El perri se alimenta de " + this.getFood());
  }
}
