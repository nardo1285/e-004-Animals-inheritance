package Atributes;

public class Animal {


  private String name;
  private String food;
  private Integer age;
  private String race;

  public Animal() {
  }

  public Animal(String name, String food, Integer age, String race) {
    this.name = name;
    this.food = food;
    this.age = age;
    this.race = race;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  //Método a sobreescribir por cada clase
  public void alimentarse() {
    System.out.println("El animal " + race + " se alimenta de " + food + ".");
  }


}
