package code;

import java.util.Scanner; // Import the Scanner class

class Main {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter your name");
            String name = input.nextLine();
            System.out.println("your name is " + name);

            System.out.println("Now start math : ");
            System.out.println("Input your First Number");

            int num = input.nextInt();
            int num2 = input.nextInt();
            int total = num + num2;
            System.out.println("Your have Total : " + total);

            /// if else with java
            System.out.println("Now start java if else and elsen if");
            System.out.println("enter your condion number : ");
            int num1 = input.nextInt();

            if (num1 < 10) {
                  System.out.println("num1 is less then 10");
            } else if (num1 == 10) {
                  System.out.println("Num1 equal 10");
            } else {
                  System.out.println("Num1 is Getter then 10");
            }

            var totalNummber = total + name;
            System.out.println("totalVariavle" + totalNummber);

            input.close();

      }

}