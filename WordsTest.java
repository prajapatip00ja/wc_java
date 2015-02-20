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
    public void iterateOverLines() {
        Words word = new Words("pooja is a good girl\r\ndolly is not");
        String option = "-L";
        assertEquals(word.findMaxOrSmlLen(option),"20 pooja is a good girl");
    }

    @Test
    public void iterateOverLines_01() {
        Words word = new Words("pooja is a good girl\r\ndolly is not");
        String option = "-S";
        assertEquals(word.findMaxOrSmlLen(option),"12 dolly is not");
    }

    @Test
    public void testEvaluate() {
        Words word = new Words("pooja is a good girl\r\ndolly is not");
        int lenOfLn = 5,lenOf1Ln = 3;
        String option = "-L";
        assertEquals(word.evaluate(lenOfLn,lenOf1Ln,option),true);
    }

    @Test
    public void testEvaluate_01() {
        Words word = new Words("pooja is a good girl\r\ndolly is not");
        int lenOfLn = 1,lenOf1Ln = 2;
        String option = "-S";
        assertEquals(word.evaluate(lenOfLn,lenOf1Ln,option),true);
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
        assertEquals(wc.giveOutput(),"2 8 ");
    }

    @Test
    public void checkOutput_01() {
        String[] args = {"one.txt" ,"-w","-c"};
        Wc wc = new Wc(args);
        assertEquals(wc.giveOutput(),"8 36 ");
    }

    @Test
    public void checkOutput_02() {
        String[] args = {"one.txt" ,"-c","-w"};
        Wc wc = new Wc(args);
        assertEquals(wc.giveOutput(),"36 8 ");
    }

    @Test
    public void checkOutput_03() {
        String[] args = {"one.txt" ,"-c","-w","-l"};
        Wc wc = new Wc(args);
        assertEquals(wc.giveOutput(),"36 8 2 ");
    }

    @Test
    public void checkOutput_04() {
        String[] args = {"one.txt" ,"-L"};
        Wc wc = new Wc(args);
        assertEquals(wc.giveOutput(),"21 pooja is a good girl.");
    }
    
    @Test
    public void checkOutput_05() {
        String[] args = {"one.txt" ,"-S"};
        Wc wc = new Wc(args);
        assertEquals(wc.giveOutput(),"13 dolly is not.");
    }

}    
