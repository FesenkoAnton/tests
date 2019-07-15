import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Write a program to find all distinct words from a text file.
 * Ignore chars like ".,/-;:" and Ignore case sensitivity.
 */
public class DistinctsWords {

    private Set wordList;
    private String file;

    public DistinctsWords(String file) {
        this.file = file;
    }

    public Set getWordList() {
        getDistinctWordList();
        return wordList;
    }

    private void getDistinctWordList() {
        wordList = new HashSet<>();
        try (FileReader fileReader = new FileReader(new File(String.valueOf(file)));
             BufferedReader br = new BufferedReader(fileReader)) {

            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, " ,.;:/-");

                while (st.hasMoreTokens()) {
                    wordList.add(st.nextToken().toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
