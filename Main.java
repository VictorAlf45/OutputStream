import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    try (
      // Create an output stream to the file
      FileOutputStream output = new FileOutputStream("Exercise17_01.txt");
    ) {
      // Output values to the file
      for (int i = 1; i <= 100; i++){
        int min = 0;
        int max = 100;
        int randomNum;
        randomNum = (int)(Math.random() * (max - min + 1) + min);
        output.write(randomNum);
      }
    }

    try (
      // Create an input stream for the file
      FileInputStream input = new FileInputStream("Exercise17_01.txt");
    ) {
      // Read values from the file
      int value;
      while ((value = input.read()) != -1)
        System.out.print(value + " ");
    }
  }
}
