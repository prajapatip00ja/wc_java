import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class WordsTest {

    @Test
    public void calcAdd() {
    	assertEquals(2,1+1);
    }

    @Test
    public void countWords() {
    	Words word = new Words("pooja is a good girl");
    	assertEquals(word.countOfWords(),5);
    }

	@Test
    public void countChars() {
    	Words word = new Words("pooja is a good girl");
    	assertEquals(word.countOfChars(),20);
    } 

    @Test
    public void countLines() {
    	Words word = new Words("pooja is a good girl\r\ndolly is not");
    	assertEquals(word.countsOfLines(),2);
    }

    @Test
    public void wordCounts() {
    	Words word = new Words("pooja is a good girl\r\n dolly is not");
    	assertEquals(word.giveWordCount(),"2 8 35");
    }
}    