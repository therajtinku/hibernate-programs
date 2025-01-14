package com.excelr;

import javax.persistence.*;
import java.util.*;
import javax.persistence.Entity;

@Entity
public class Question {
	@Id
	@GeneratedValue
	private int id;
	private String qname;
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "quid")
	@OrderColumn(name = "type")
	private List<Answers> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	

}
