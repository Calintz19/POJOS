package com.cenfotec.stretto.pojo;

import java.sql.Date;

public class QuestionPOJO{
	
	private int id;
	private String question;
	private Date questionDate;
	private String answer;
	private String answerDate;
	private boolean isRead;

	public QuestionPOJO() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int pId) {
		this.id = pId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String pQuestion) {
		this.question = pQuestion;
	}

	public Date getQuestionDate() {
		return questionDate;
	}

	public void setQuestionDate(Date pQuestionDate) {
		this.questionDate = pQuestionDate;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String pAnswer) {
		this.answer = pAnswer;
	}

	public String getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(String pAnswerDate) {
		this.answerDate = pAnswerDate;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean pIsRead) {
		this.isRead = pIsRead;
	}	
}
