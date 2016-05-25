package np.com.rts.internship.beginners;

import java.util.*;

public class Main {

  ArrayList<Animal> originalList = new ArrayList<Animal>() {{
    add(new Herbivore("lamb", 4));
    add(new Herbivore("cow", 4));
    add(new Herbivore("giraffe", 4));
    add(new Carnivore("lion", 4));
    add(new Carnivore("bear", 4));
    add(new Carnivore("leopard", 4));
    add(new Carnivore("panther", 4));
    add(new Omnivore("human", 2));
  }};

  ArrayList<Herbivore> herbivores = new ArrayList<>();
  ArrayList<Carnivore> carnivores = new ArrayList<>();
  ArrayList<Omnivore> omnivores = new ArrayList<>();

  public Main() {
    // Write your code here
    for (Animal a : originalList) {
      if (a instanceof Carnivore) {
        carnivores.add((Carnivore) a);
      }
      if (a instanceof Herbivore) {
        herbivores.add((Herbivore) a);
      }
      if (a instanceof Omnivore) {
        omnivores.add((Omnivore) a);
      }
    }

    System.out.println("Herbivores:");
    for(Herbivore h:herbivores){
      System.out.println(h.getName()+" has "+h.getLegs()+" legs.");
    }
    System.out.println("\nCarnivores:");
    for(Carnivore c:carnivores){
      System.out.println(c.getName()+" has "+c.getLegs()+" legs.");
    }
    System.out.println("\nOmnivores:");
    for(Omnivore h:omnivores){
      System.out.println(h.getName()+" has "+h.getLegs()+" legs.");
    }
  }
  public static void main(String[] args) {
    new Main();
  }
}
