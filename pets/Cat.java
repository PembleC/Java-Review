package pets;

public class Cat {
  private static final int INIT_NUM_LIVES = 9;  // static means it is shared by all instances of the class
  private String name;
  private int age;

  public Cat(String name) {
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
    return "meow";
  }
}


/*
Could create a public class
  You can only have one public class per file
  One file per class
*/
