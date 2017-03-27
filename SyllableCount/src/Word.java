
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Word {
  public Stack<String> all_words;
	
  public Word(String file) {
    all_words = new Stack<String>();
    readWordFile(file);
  }

  private void readWordFile(String file) {
    try {
      FileReader     fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
			
      String word = null;
      while ((word = br.readLine()) != null) {
        all_words.add(word);
      }
	
      br.close();
			
    } catch (FileNotFoundException e) {
      System.err.println("Could not read the file " + file);
    } catch (IOException e) {
      System.err.println("Problem reading the file " + file);
    }
  }
}

