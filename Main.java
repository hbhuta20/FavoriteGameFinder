import java.util.Scanner; // This is really important for you to use scanner without this scanner does not function properly.
// My idea is that I will be creating a code that will making a code that will show what games a perosn can like.
class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner (System.in);
  
    System.out.println("Please enter a number:");//added a print statement.
    int a = scan.nextInt();
    int t = transform(a);
    String p = prefer(t);
    System.out.println(p); // added another print statement.

  }
  static int transform(int a)// Added method for transforming a
  {
    return 5*a-a+3;  
  }

  static String prefer(int t)// Added method for transforming t
  {
    if (t > 50){
      return "You will prefer Fortnite!! ";
    }
    else{
      return "You will prefer Minecraft!!";
    }
  }
}