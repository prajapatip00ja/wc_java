public class readFile{
	public static void main(String[] args) {
		//String st = new String("pooja is a good girl"+"\r\n"+pooja);
		//String file = this.giveFile();
		Reader rd = new Reader("./one.txt");
		char[] o = rd.readFile();
		String st = new String(o);
		String[] str = st.split("\W"); 
		for(int i= 0;i<36;i++){
			System.out.println(str[i]+""+i);
		}
	}
}