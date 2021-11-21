package code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner; // Import the Scanner class
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStreamReader;

class Main {

      public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("input you documentions for output the result : ");
            String name = input.nextLine();
            String filePath = "/Users/developer/Desktop/java/texts.text";

            try {
                  File data = new File(filePath);
                  FileOutputStream file = new FileOutputStream(data);
                  FilterOutputStream filter = new FilterOutputStream(file);

                  byte b[] = name.getBytes();
                  System.out.println(b);
                  filter.write(b);
                  filter.flush();
                  filter.close();
                  file.close();
                  System.out.println("Success...");
                  FileInputStream fstream = new FileInputStream(filePath);
                  BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
                  String strLine;
                  while ((strLine = br.readLine()) != null) {
                        System.out.println("You have Result : ");

                        System.out.println(strLine);
                  }
                  fstream.close();

            } catch (Exception e) {
                  System.out.println(e);
            }

            // FileWriteReadClass fileWriteReadClass = new FileWriteReadClass();
            // System.out.println("Print Line");
            // fileWriteReadClass.getWriteReadFun();

            // Scanner input = new Scanner(System.in);
            // System.out.println("enter your name");
            // String name = input.nextLine();
            // System.out.println("your name is " + name);

            // System.out.println("Now start math : ");
            // System.out.println("Input your First Number");

            // int num = input.nextInt();
            // int num2 = input.nextInt();
            // int total = num + num2;
            // System.out.println("Your have Total : " + total);

            // /// if else with java
            // System.out.println("Now start java if else and elsen if");
            // System.out.println("enter your condion number : ");
            // int num1 = input.nextInt();

            // if (num1 < 10) {
            // System.out.println("num1 is less then 10");
            // } else if (num1 == 10) {
            // System.out.println("Num1 equal 10");
            // } else {
            // System.out.println("Num1 is Getter then 10");
            // }

            // var totalNummber = total + name;
            // System.out.println("totalVariavle" + totalNummber);
            // input.close();
            //////

            /////// Java file write and read from user inout and output/////

      }

}