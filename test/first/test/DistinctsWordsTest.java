import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class DistinctsWordsTest {

    @Test
    public void test1() {
        DistinctsWords distinctFileWords = new DistinctsWords("src//1.txt");
        Set<String> wordList = distinctFileWords.getWordList();
        assertEquals("[aaa, fxcc, 2, weffwefsx, fewwef, 23f, jr2l3f3f, j33, \\, fwefwef, j24, 32j3]", wordList.toString());

    }

}