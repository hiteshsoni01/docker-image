package hitesh.com.quiz.domain;

import lombok.Data;

@Data
public class QuizResponse {

	private String questions;
	private String options;

	public QuizResponse() {}
	
	public QuizResponse(String questions, String options) {
		super();
		this.questions = questions;
		this.options = options;
	}

	
}
