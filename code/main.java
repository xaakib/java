package code;
import java.util.Scanner; // Import the Scanner class

// class Main {
//   public static void main(String[] args) {
//     Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//     System.out.println("Enter username");

//     String userName = myObj.nextLine();  // Read user input
//     System.out.println("Username is: " + userName);  // Output user input
//   }
// }

class Main {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter your name");
            String name = input.nextLine();
            System.out.println("your name is " + name);

            System.out.println("Now start math : ");
            System.out.println("Input your First Number");

            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int total = num1+num2;
            System.out.println("Your have Total : " + total);
            input.close();
            

      }

}