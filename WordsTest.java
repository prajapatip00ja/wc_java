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
        String[] args = {"one.txt" ,"-l"};
        Wc wc = new Wc(args);
        assertEquals(wc.giveFile(),"one.txt");
    }

    @Test
    public void giveOptions() {
        String[] args = {"one.txt" ,"-l","-w"};
        Wc wc = new Wc(args);
        String[] options = {"-l","-w"};
        assertEquals(wc.giveOptions(),options);
    }

    @Test
    public void checkOutput() {
        String[] args = {"one.txt" ,"-l","-w"};
        Wc wc = new Wc(args);
        assertEquals(wc.giveOutput(),"2 7 ");
    }

    @Test
    public void checkOutput_01() {
        String[] args = {"one.txt" ,"-w","-c"};
        Wc wc = new Wc(args);
        assertEquals(wc.giveOutput(),"7 36 ");
    }

    @Test
    public void checkOutput_02() {
        String[] args = {"one.txt" ,"-c","-w"};
        Wc wc = new Wc(args);
        assertEquals(wc.giveOutput(),"36 7 ");
    }

    @Test
    public void checkOutput_03() {
        String[] args = {"one.txt" ,"-c","-w","-l"};
        Wc wc = new Wc(args);
        assertEquals(wc.giveOutput(),"36 7 2 ");
    }
}    