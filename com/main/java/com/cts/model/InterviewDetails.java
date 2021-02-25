package com.cts.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@javax.persistence.Entity
@Table(name = "interview")
public class InterviewDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer interviewId;
	private String interviewQuestion;
	private String failureReason;
	private String answer;
	private String interviewDate;
	private String companyName;

	@Id
	@Column(name = "id")
	@GeneratedValue
	public Integer getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(Integer interviewId) {
		this.interviewId = interviewId;
	}
	@Column(name="company_name")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Column(name="failure_reason")
	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}
	
	@Column(name="interview_question")
	public String getInterviewQuestion() {
		return interviewQuestion;
	}

	public void setInterviewQuestion(String interviewQuestion) {
		this.interviewQuestion = interviewQuestion;
	}
	@Column(name="answer")
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	@Column(name="interview_date")
	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

	

}
