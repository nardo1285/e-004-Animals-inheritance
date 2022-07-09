package Main;

import Atributes.Animal;
import Atributes.Gato;
import Atributes.Perro;

public class Main {

  public static void main(String[] args) {

    //Declaración del objeto Perro
    Animal perro01 = new Perro("Firu", "Carnita", 2, "Caniche", "Birf!");
    perro01.alimentarse();

    Perro perro02 = new Perro("Kuki", "Pollo", 3, "Dogo", "Warff!");
    perro02.alimentarse();


    Animal gato01 = new Gato("Jelly","Fish",4,"Angora","Miauto");
    gato01.alimentarse();
  }
}
