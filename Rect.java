public class Rect {
  //instance-level variables that can be used anywhere in the class
  public int width;
  public int length;

  //constructor method
  //can be instantiated using the 'new' keyword
  //doesn't need return type
  public Rect(int width, int length) {
    //you have to use 'this' here because instance variables above
    //'shadow' parameters (what does this mean?)
    this.width = width;
    this.length = length;
  }

  //the area method
  //use of 'this' is recommended
  public int area(){
    return this.width*this.length;
  }

  //make a main method to test our class
  public static void main(String[] args) {
    //create a variable of type Rect
    //invoke the constructor to instantiate a new Rect object
    Rect myRect = new Rect(10,4);
    //invoke the area method on the myRect object and pring
    System.out.println(myRect.area());
  }

}
