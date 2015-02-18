public class Words {
	int count_lines;
	int count_words;
	int count_chars;
	String lines;
	
	public Words(String lines_of_file){
		this.lines = lines_of_file;
	}	

	public int countsOfLines(){
		return this.lines.split("\r\n").length;
	}

	public int countOfWords(){
		return this.lines.split(" ").length;
	}

	public int countOfChars(){
		return this.lines.split("").length;
	}

	public String giveWordCount(){
		int lines,words,chars;
		lines = this.countsOfLines();
		words = this.countOfWords();
		chars = this.countOfChars();
		return lines+" "+words+" "+chars;
	}

	public int associatedFunctions(String option){
		switch (option) {
			case "-w":
				return this.countOfWords();
			case "-l":
				return this.countsOfLines();
			case "-c":
				return this.countOfChars();		
			default :
				return 0;
		}
	}

	public String parseOptions(String[] options){
		String counts = new String();
		for (int i = 0; i < options.length; i++){
			counts += associatedFunctions(options[i])+" ";
		}
		return counts;
	}

}