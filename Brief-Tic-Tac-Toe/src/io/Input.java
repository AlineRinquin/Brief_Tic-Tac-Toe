package io;

import java.util.Scanner;

public class Input {
	
	//methodes statics
	public static int readInt(Scanner scan){
		String input = scan.nextLine();
		int result = -1;
		try {
			result = Integer.parseInt(input);
		}catch (NumberFormatException e) {
		}
		 return result;
		 
		
	}
	

}
