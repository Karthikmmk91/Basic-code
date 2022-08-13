package org.basicjava;

public class Topics {
	
	private void CurrentTopics() {
		
		System.out.println("Current topic is basic java");

	}

	public static void main(String[] args) {
	
		Topics t = new Topics();
		
		t.CurrentTopics();
		
		JavaTeam j = new JavaTeam();
		
		j.trainer();
		j.teammates();
	}
}
