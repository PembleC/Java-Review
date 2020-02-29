package pets;

public class Dog {
  private String name;
  private int age;

  public Dog(String name) {
    this.name = new String(name);
    this.age = 0;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int setAge) {
    this.age = setAge;
  }

  public int getAge() {
    return this.age;
  }

  public static String says(){    // Static means you don't need an object to call this function
    return "woof";
  }
}


/*
Could create a public class
  You can only have one public class per file
  One file per class
*/
