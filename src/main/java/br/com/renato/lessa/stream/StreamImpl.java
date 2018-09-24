package br.com.renato.lessa.stream;


/**
 * 
 * @author r.lessa.da.silva
 *
 */
public class StreamImpl implements Stream {

	private int i = 0;
	private char[] chars = null;
	
	public StreamImpl(String str){
		chars = str.toCharArray();
	}
	
	public boolean hasNext() {
		return i <= (chars.length-1);
	}
	
	public char getNext() {
		return chars[i++];
	}

}