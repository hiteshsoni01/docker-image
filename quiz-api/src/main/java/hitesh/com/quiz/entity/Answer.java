package hitesh.com.quiz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Answer")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "QID")
	int qId;
	
	@Column(name = "ANSWER")
	int answer;

	public Answer() {}
	
	public Answer(int qId, int answer) {
		super();
		this.qId = qId;
		this.answer = answer;
	}
	
	
}
