package nameGenerator;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Agnieszka Guzik
 **/


public class Main {
	public static void main(String[] args) {
		
		String name;
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Choose the kind of name that you want to be generated:");
		System.out.println("Press 1 to generate the random set of chars");
		System.out.println("Press 2 to generate the random first and second name");
		System.out.println("Press 3 to generate the rando s-fi name");
		try{
			int i=scan.nextInt();
			
			switch (i) {
				case 1:{
					NameGenerator g = new CharsGenerator();
					name = g.generate();
					System.out.println("Your ganerated name is "+name);
					break;
				} 
				case 2:{
					NameGenerator g = new TrueGenerator();
					name = g.generate();
					System.out.println("Your ganerated name is "+name);
					break;
				}
				case 3:{
					NameGenerator g = new SFiGenerator();
					name = g.generate();
					System.out.println("Your ganerated name is "+name);
					break;
				}
				default:{
					System.out.println("Wrong data");
					break;
				}
			}
			
			scan.close();
		}
		catch(IllegalFormatException e){
			scan.close();
			System.out.println("Wrong data ");
		}
		catch(InputMismatchException e){
			scan.close();
			System.out.println("Wrong data ");
		}
	}

}
