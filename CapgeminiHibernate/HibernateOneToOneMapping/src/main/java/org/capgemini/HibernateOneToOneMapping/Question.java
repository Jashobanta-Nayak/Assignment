package org.capgemini.HibernateOneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name="question_id")
	private int questionId;
	private String questionName;
	
	@OneToOne
	@JoinColumn(name="ans_id")
	private Answer answer;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(int questionId, String questionName, Answer answer) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;
		this.answer = answer;
	}

	public Question() {
		super();
	}
	
	
	
	

}
