package hitesh.com.quiz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Getter;
//import lombok.Setter;

@Entity
//@Getter
//@Setter
@Table(name = "options")
public class Options {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "QID")
	int qId;

	@Column(name = "OPTION_1")
	String option1;

	@Column(name = "OPTION_2")
	String option2;

	@Column(name = "OPTION_3")
	String option3;

	@Column(name = "OPTION_4")
	String option4;

	public Options() {
	}

	public Options(int qId, String option1, String option2, String option3, String option4) {
		super();
		this.qId = qId;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}
}
