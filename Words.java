public class Words {
	private String texts;
	
	public Words(String lines_of_file){
		this.texts = lines_of_file;
	}	

	public int countsOfLines(){
		return this.texts.split("\r\n").length;
	}

	public int countOfWords(){
		return this.texts.split("\\W+").length;
	}

	public int countOfChars(){
		return this.texts.split("").length;
	}

	public String findMaxLen(){
		String[] lines = this.texts.split("\r\n");
		int lenOf1Ln = lines[0].length();	
		String firstLine = lines[0];
		for(int i = 1 ; i<lines.length ; i++){
			if(lines[i].length()>lenOf1Ln){
				lenOf1Ln = lines[i].length();
				firstLine = lines[i];
			}
		}
		return(lenOf1Ln + " " + firstLine);
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