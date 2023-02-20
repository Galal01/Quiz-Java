package quiz;

public class Quiz {
	public static void main(String[] args) {
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
				"how many letters in apple?",
				 "4",
				 "2",
				 "5",
				 "7",
				 "1",
				 "C");
		question.check();    
		question.showResults();
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
				"how many letters in orange?",
				 "4",
				 "8",
				 "5",
				 "7",
				 "6",
				 "E");
		question2.check();    
		question2.showResults();
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
				"how many letters in blue?",
				 "4",
				 "2",
				 "6",
				 "3",
				 "7",
				 "A");
		question3.check();    
		question3.showResults();
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
				"how many letters in tea?",
				 "1",
				 "0",
				 "2",
				 "4",
				 "3",
				 "E");
		question4.check();    
		question4.showResults();
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
				"how many letters in water?",
				 "6",
				 "2",
				 "4",
				 "5",
				 "7",
				 "D");
		question5.check();    
		question5.showResults();
		
		Question question_1 = new TrueFalseQuestion("is 5 > 3 ?", "TRUE");
		question_1.check();    
		question_1.showResults();
		Question question_2 = new TrueFalseQuestion("is 5 < 3 ?", "FALSE");
		question_2.check();    
		question_2.showResults();
		Question question_3 = new TrueFalseQuestion("is 1 > 3 ?", "FALSE");
		question_3.check();    
		question_3.showResults();
		Question question_4 = new TrueFalseQuestion("is 0 > 3 ?", "FALSE");
		question_4.check();    
		question_4.showResults();
		Question question_5 = new TrueFalseQuestion("is 9 > 5 ?", "TRUE");
		question_5.check();    
		question_5.showResults();
	
	}
}
