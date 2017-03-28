import java.util.StringTokenizer;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Word word = new Word("data/input.txt");	
		WriteToFile newfile = new WriteToFile("data/output.txt");
		if (isHaiku(word))
			newfile.writeContent("true");
		else 
			newfile.writeContent("false");
		

	}
	static boolean isHaiku(Word file) {
		String[] line3 = null;
		String[] line2 = null;
		String[] line1 = null;
		if(!file.all_words.isEmpty()){
			line3 = file.all_words.pop().split("\\s");
		}
		if(!file.all_words.isEmpty()){
			line2 = file.all_words.pop().split("\\s");
		}
		if(!file.all_words.isEmpty()){
			line1 = file.all_words.pop().split("\\s");
		}
		if (line3 == null ||
				line2==null ||
				line1==null)
			return false;
		EnglishSyllableCounter check = new EnglishSyllableCounter();
		for (String a: line3)
			System.out.print(a + " ");
		for (String b: line2)
			System.out.print(b + " ");
		for (String c: line1)
			System.out.print(c + " ");
		int three = 0;
		int two = 0;
		int one = 0;
		for (int x = 0; x < line3.length ; x++)
			three += check.countSyllables(line3[x]);
		for (int y = 0; y < line2.length ; y++)
			two += check.countSyllables(line2[y]);
		for (int z = 0; z < line1.length ; z++)
			one += check.countSyllables(line1[z]);

		return ((one ==4 || one == 5 || one == 6 || one == 7)
				&& ( two == 6 || two == 7 || two == 8 || two == 9) 
				&& (three == 4 || three == 5 || three == 6|| three == 7));

	}
}