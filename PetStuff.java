import pets.Cat;  //This allows us to use the Cat class
import pets.Dog;

class PetStuff {
  public static void main(String[] args) {
    Cat c = new Cat("Whiskers");
    System.out.println("The cat's name is " + c.getName());
    System.out.println("The cat's age is " + c.getAge());
    c.setAge(18);
    System.out.println("The cat's age is now " + c.getAge());

    System.out.println("The cat says " + c.says());
    System.out.println("The cat says " + Cat.says());   // Static allows me to do this.

    Dog d = new Dog("Snoopy");
    System.out.println("The dog says " + d.says());

  }
}
