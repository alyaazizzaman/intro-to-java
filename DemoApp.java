public class DemoApp{
  public static void main(String[] args){
    //create User with name Chewbacca
    User chewie = new User("Chewbacca");

    //prints Chewbacca
    System.out.println(chewie.userName);
    //prints Chewbacca
    System.out.println(User.userName);

    //create User with name Vader
    User vader = new User("Vader");

    //why static fields are dangerous on objects that should be unique!

    System.out.println(vader.userName); //prints Vader
    System.out.println(chewie.userName); //prints Vader
    System.out.println(User.userName); // prints Vader

  }
}
