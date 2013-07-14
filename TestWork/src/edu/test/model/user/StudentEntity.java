package edu.test.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ASTUDENT")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID; 
	@Column(name="LNAME", nullable=false)
	private String lname;
	@Column(name="FNAME", nullable=false)
	private String fname;
	@Column(name="STARTDATE")
	private String startDate;
	@Column(name="ENDDATE")
	private String endDate;
	@Column(name="PASSWORD")
	private String password;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public StudentEntity(){
	}
	
	
	
}
