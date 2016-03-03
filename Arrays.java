public class Arrays {
  public static void main (String[] args) {
    //creates an array that will only take Strings
    //and will only take 4 items
    String [] names = new String[4];
    //the array has a length of 4, even though we haven't put anything in it
    System.out.println(names.length);
    //put string "hello" in the 0th index
    names[0] = "Hello";
    //put string "World" in the 1st index
    names[1] = "World";
    //length is still 4, even though we put 2 items in it
    System.out.println(names.length); //4
    System.out.println(names); //prints memory address
    System.out.println(names[0]); //prints "Hello"

  }

}
