import java.io.*;
import javax.swing.JOptionPane;

public class Popup {

  public static void main(String[] args) throws IOException {
    // Get the substring to search for.
    String term = JOptionPane.showInputDialog("Search Term : ");
    // Get the file location from the user
    String fileName = JOptionPane.showInputDialog("File Location : ");
    // Read the file's contents to the console
    ReadFile(fileName, term);
  }

  public static void ReadFile(String fileName, String term) throws IOException {
    try {
      // Read the file in via the file's location (fileName)
      FileReader fread = new FileReader(fileName);
      // Create a read buffer to read file contents
      BufferedReader inputFile = new BufferedReader(fread);
      // variable to hold each line of data from the file
      String currentLine;
      Integer total = 0;

      // Read the file buffer, line by line, until all contents are printed to console
      while ((currentLine = inputFile.readLine()) != null) {
        String line = currentLine.toLowerCase();
        String lowerCaseTerm = term.toLowerCase();
        // We split the string into an array via the search term
        String[] str = line.split(lowerCaseTerm);
        // There was no term match
        if (str.length == 1) {
          // Do nothing.
        } else if (str.length > 1) {
          // There was a match, and the nunber of occurances = the length
          // of the array munis 1 :)
          total = total + str.length - 1;
        }
      }
      System.out.println("Number of Occurences: " + total);
      JOptionPane.showMessageDialog(
        null,
        "There should be something in the console for you..."
      );
      // Close file buffer to prevent memory leaks!
      inputFile.close();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File Not Found!");
    }
  }
}
