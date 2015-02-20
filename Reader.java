import java.io.*;
public class Reader {
	String file;
	
	public Reader(String file){
		this.file = file;
	}

	public char[] readFile(){
		BufferedReader inputFile;	
		File fr = new File(this.file);
		int length = (int)fr.length();
		char cbuf[] = new char[length];
		try{
		    inputFile = new BufferedReader(new FileReader (file));
			inputFile.read(cbuf,0,length);
	    }   
        catch (IOException ioe){
            System.out.println (ioe.getMessage());
            ioe.printStackTrace ();
        }
        return cbuf;
	}
}
