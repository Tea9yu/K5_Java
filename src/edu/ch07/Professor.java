package edu.ch07;

public class Professor extends Person {
	private String subject;
	
	public String getSubject() {
		return subject;		
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
//		return super.toString()
		return subject;
	}

}
