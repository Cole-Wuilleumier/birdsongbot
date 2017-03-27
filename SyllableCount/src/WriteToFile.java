
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	private String FILENAME;
	private BufferedWriter bw;
	FileWriter fw;
	
	public WriteToFile(String filename) {
		FILENAME = filename; 
		bw = null;
		fw = null;
	}
	public void writeContent(String word){
		try {

			String content = word + "\n";

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}