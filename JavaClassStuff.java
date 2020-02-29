import java.time.LocalDateTime;
import pets.Cat;

class JavaClassStuff {
  public static void main(String[] args){
    Object o = new Cat("Fury");

    String s = new String("Something");
    System.out.println("s.length(): " + s.length());

    if(s == "Something"){
      System.out.println("s == Something"); // Doesn't work
    }

    if(s.equals("Something")){  // Works
      System.out.println("s equals Something");
    }

    double pi = Double.parseDouble("3.14159265");
    String piStr = String.valueOf(3.141592);    // Works for int to string, double to string... etc

    System.out.println(pi);
    System.out.println(piStr);


    System.out.println("The time is now: " + LocalDateTime.now());

  }
}
