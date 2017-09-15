package vocabulary;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CommandList {

	private ArrayList<String> command = new ArrayList<String>();
	private ArrayList<String> reply = new ArrayList<String>();
	
	private String temporaryString;
	private String commandTxt = "Command.txt";
	private String replyTxt = "Reply.txt";
	private boolean titleFound = false;
	
	public ArrayList<String> getCommand() {
		
		return command;
		
	}
	
	public ArrayList<String> getReply() {
		
		return reply;
		
	}
	
	public void initializeCommand() {
		
		try {
		
			BufferedReader reader = new BufferedReader(new FileReader(commandTxt));
			while((temporaryString = reader.readLine()) != null) {
				
				command.add(temporaryString);
				
			}
			reader.close();
		
		} catch (IOException e) {

			e.printStackTrace();
		
		}
		
	}
	
	public void initializeReply() {
		
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader(replyTxt));
			while((temporaryString = reader.readLine()) != null) {
				
				reply.add(temporaryString);
				
			}
			reader.close();
			
		} catch (IOException e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public void test() {
		
		initializeReply();
		System.out.println(reply.size());
		for (int i = 0; i < reply.size(); i++) {
			
			System.out.println(reply.get(i));
			
		}
		
	}
	
	public boolean matchCommandGreeting(String input) {
		
		boolean matchFound = false;
		for (int i = 0; i < command.size(); i++) {
			
			greetingsFound(i, input);
			
		}
		
		return matchFound;
		
	}
	
	public boolean greetingsFound(int i, String input) {
		
		boolean match = false;
		if (input.equals("Greetings:")) {
			
			System.out.println("check");
			titleFound = true;
			
		}
		
		if (titleFound) {
			
			if (input.equals(command.get(i))) {
				
				match = true;
				
			}
			
		}
		
		if (input.equals("Parting:")) {
			
			titleFound = false;
			
		}
		
		return match;
		
	}
	
}
