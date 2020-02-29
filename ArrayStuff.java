class ArrayStuff {
  public static void main(String[] args) {
    int[] intArray;
    // int* intArray;
    intArray = new int[10];

    intArray[0] = 0;
    // intArray[1000] = 1000;

    for (int i = 0; i < intArray.length; i++) {
      int elem = intArray[i];
      intArray[i] = i * i;
    }

    for (int elem : intArray) {
      System.out.println(elem);
    }
  }
}
