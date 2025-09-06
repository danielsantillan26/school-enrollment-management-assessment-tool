package objects;

import java.util.ArrayList;

public class Section {

	private String title;
	private int questionCount;
	private ArrayList<String> questions;
	private String[] scoreMeanings;
	private ArrayList<Boolean> isAnswered;
	private ArrayList<Integer> currentPointCount;
	
	public Section(String title) {
		this.title = title;
		questionCount = 0;
		questions = new ArrayList<String>();
		scoreMeanings = new String[3];
		isAnswered = new ArrayList<Boolean>();
		currentPointCount = new ArrayList<Integer>();
	}
	
	
	public void addQuestion(String question) {
		questionCount = 0;
		questions.add(question);
		isAnswered.add(false);
		currentPointCount.add(0);
	}
	
	
	// -1 for invalid, 0 for red, 1 for yellow, 2 for green
	public int getColor() {
		for (Boolean b : isAnswered) {
			if (b == false) {
				return -1;
			}
		}
		
		int currentTotalPoints = getCurrentPoints();
		if (questionCount == 3) {
			if (currentTotalPoints >= 12) {
				return 2;
			} else if (currentTotalPoints >= 8) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if (currentTotalPoints >= 15) {
				return 2;
			} else if (currentTotalPoints >= 10) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	
	public void answerQuestion(int questionIndex, int points) {
		isAnswered.set(questionIndex, true);
		currentPointCount.set(questionIndex, points);
	}
	
	
	public void clearSelection(int questionIndex) {
		isAnswered.set(questionIndex, false);
		currentPointCount.set(questionIndex, 0);
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public int getQuestionCount() {
		return questionCount;
	}
	
	
	public int getCurrentPoints() {
		int pointTotal = 0;
		for (Integer i : currentPointCount) {
			pointTotal += i;
		}
		return pointTotal;
	}
	
	
	public void setMeanings(String[] scoreMeanings) {
		this.scoreMeanings = scoreMeanings;
	}
	
}
