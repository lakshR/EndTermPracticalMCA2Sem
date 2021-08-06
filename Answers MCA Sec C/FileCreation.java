import java.io.*; 
import java.io.IOException;
import java.util.*;

public class FileCreation {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename");
      if (myObj.createNewFile()) 
      {
        System.out.println("File created with the name " + myObj.getName());
        
        
        // To read the write content on the File............
        
        FileWriter myWriter = new FileWriter("Muskan");
        
        System.out.println("Hii!! My NAme is Muskan Pathak.I am persuing MCA from GEHU Dehradun.");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        myWriter.write(str);
        myWriter.close();
        
        // To show the output of the file.
        
        System.out.println("The content of the files are as follows");
        String line = null;
        FileReader fileReader = new FileReader("Muskan");
      
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        while((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
        }
        bufferedReader.close();
        
      } 
      else {
        System.out.println("File already exists.");
      }
    }
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();

    }
  }
}