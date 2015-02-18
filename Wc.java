import java.io.*;
public class Wc {	
	String input;
	String file;
	String options;

	public Wc(String input){
		this.input = input;
	}

	public String giveFile(){
		return this.input.split(" ")[0];
	}

	public String[] giveOptions(){
		String[] arguments = this.input.split(" ");
		String[] options = new String[arguments.length-1];
		int count = 0;
		for(int i =0; i<arguments.length; i++){
				if(arguments[i].indexOf("-")==0){
				options[count] = arguments[i];
				count++;
			}
		}
		return options;
	}


	public String giveText(){
		BufferedReader inputFile;
		String inputLine = new String();
		String file = this.giveFile();
		try{
		    inputFile = new BufferedReader(new FileReader (file));
	        inputLine = inputFile.readLine();
	    }   
        catch (IOException ioe){
            System.out.println (ioe.getMessage());
            ioe.printStackTrace ();
        }
        return inputLine;
	}

	public String giveOutput(){
		String[] options = this.giveOptions();
		String text = this.giveText();
		Words word = new Words(text);
		return word.parseOptions(options);
	}
}