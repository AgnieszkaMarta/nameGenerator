package nameGenerator;

import java.util.Random;

public class CharsGenerator implements NameGenerator {
	private String generated="";
	private int numberOfChars;
	
	@Override
	public String generate() {
		Random gen = new Random();
		
		numberOfChars=gen.nextInt(8)+4;
		
		for(int i=0; i<numberOfChars; i++) {
			generated+=(char)(gen.nextInt(94)+33);
		}
		
		return generated;
	}
}
