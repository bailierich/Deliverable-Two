import java.util.Scanner;

public class MessegeDecoder {

	public static void main(String[] args) {
		String input;
		String message = " ";
		int checksum = 0;
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("What is your message?");
		input = scnr.next();
		
		for ( char i = 0; i < input.length(); ++i) {
			char ch = input.charAt(i);
			ch = Character.toLowerCase(ch);
			message = message  + (ch - 'a' + 1) + "-";
			
			int uni = Character.toUpperCase(ch);
			checksum = checksum + uni;
		
		}
		
		System.out.println("Your encoded message is " + message);
		System.out.println("Message checksum is " + checksum);
	}

	
		
	}
		

