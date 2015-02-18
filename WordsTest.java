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

    @Test
    public void associatedFunctions() {
        Words word = new Words("pooja is a good girl\r\n dolly is not");
        assertEquals(word.associatedFunctions("-l"),2);
    }

    @Test
    public void parseOtions() {
        Words word = new Words("pooja is a good girl\r\n dolly is not");
        String[] options = {"-l","-w"};
        assertEquals(word.parseOptions(options),"2 8 ");
    }

    @Test
    public void giveFiles() {
        Wc wc = new Wc("one.txt -l");
        assertEquals(wc.giveFile(),"one.txt");
    }

    @Test
    public void giveTexts() {
        Wc wc = new Wc("one.txt");
        assertEquals(wc.giveText(),"pooja is a good girl.");
    }

    @Test
    public void giveOptions() {
        Wc wc = new Wc("one.txt -l -w");
        String[] options = {"-l","-w"};
        assertEquals(wc.giveOptions(),options);
    }

    @Test
    public void checkOutput() {
        Wc wc = new Wc("one.txt -l -w");
        assertEquals(wc.giveOutput(),"1 5 ");
    }

    @Test
    public void checkOutput_01() {
        Wc wc = new Wc("one.txt -l -c");
        assertEquals(wc.giveOutput(),"1 21 ");
    }

    @Test
    public void checkOutput_02() {
        Wc wc = new Wc("one.txt -l -c -w");
        assertEquals(wc.giveOutput(),"1 21 5 ");
    }
    
    



}    