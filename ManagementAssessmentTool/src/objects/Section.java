package objects;

import java.util.ArrayList;

public class Section {

	private int questionCount;
	private ArrayList<String> questions;
	private int totalPoints;
	
	public Section() {
		questionCount = 0;
		questions = new ArrayList<String>();
		totalPoints = 5*questionCount;
	}
	
	
	public void addQuestion(String question) {
		questions.add(question);
		totalPoints = 5*questionCount;
	}
	
}
