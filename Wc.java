import java.io.*;
public class Wc {	
	String[] input;

	public Wc(String[] input){
		this.input = input;
	}

	public String giveFile(){
		return this.input[0];
	}

	public String[] giveOptions(){
		String[] arguments = this.input;
		String[] options = new String[arguments.length-1];
		String[] defaultOption = {"-l","-w","-c"};
		int count = 0;
		for(int i =0; i<arguments.length; i++){
				if(arguments[i].indexOf("-")==0){
				options[count] = arguments[i];
				count++;
			}
		}
		if(options.length==0)
			return defaultOption;
		return options;
	}

	public char[] giveText(){
		String file = this.giveFile();
		Reader rd = new Reader(file);
		char[] o = rd.readFile();
		return rd.readFile();
	}

	public String giveOutput(){
		String[] options = this.giveOptions();
		String texts = new String(this.giveText());
		Words word = new Words(texts);
		return word.parseOptions(options);
	}

	public static void main(String[] args) {
		Wc wc = new Wc(args);
		String texts = new String(wc.giveText());
		String[] options = wc.giveOptions();
		Words words = new Words(texts);
		System.out.println(words.parseOptions(options)+" "+wc.giveFile());
	}
}
