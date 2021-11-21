package code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner; // Import the Scanner class
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStreamReader;

public class FileWriteReadClass {
      Scanner input = new Scanner(System.in);

      public void getWriteReadFun() {

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

      }
}
