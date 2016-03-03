public class Person {

  //create some instance-level variables
  //these can be used anywhere in the class
  public String first;
  public String last;

  //constructor method
  //invoke this using the 'new' keyword, which instantiates an object
  //it does not need a return type
  public Person(String first, String last) {
    //since the instance variable 'first' 'shadows' the parameter
    //'first', you must used 'this.first'
    this.first = first;
    this.last = last;
  }
  //the 'fullName method' is added inside the class definition
  //you don't need 'this' but it is recommended
  public String fullName(){
    return first + " " + last;
  }

  //use the main method to test our class
  public static void main(String[] args){
    //create a variable of type Person
    //invoke the constructor to instantiate/create a new Person object
    Person rambo = new Person("Sylvester", "Stallone");
    //invoke the method on Rambo and print
    System.out.println(rambo.fullName());
  }
}
