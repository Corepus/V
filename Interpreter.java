package vocabulary;

import java.util.Scanner;

public class Interpreter {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		CommandList command = new CommandList();
		
		String input;
		boolean running = true;
		
		command.initializeCommand();
		
		while(running) {
			
			input = scanner.nextLine();
			
			if (command.matchCommandGreeting(input)) {
				
				System.out.println("Hello");
				
			}
			
		}
		
		scanner.close();
		
	}
	
}
