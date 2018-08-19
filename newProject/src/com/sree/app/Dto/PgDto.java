package com.sree.app.Dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="register_table")
public class PgDto implements Serializable{
	@Id
	@GenericGenerator(name="auto" ,strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name = "user_id")
	private int userId;
	@Column(name="person_name")
	private String PersonName;
	@Column(name="email_id")
	private String personEmailId;
	@Column(name="person_address")
	private String personAddress;
	@Column(name="person_mob")
	private Long personMobilno;
	@Column(name="person_age")
	private int personAge;
	@Column(name="join_date")
	private String joinDate;
	@Column(name="amount")
	private Double Paidamount;
	@Column(name="password")
	private String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public String getPersonEmailId() {
		return personEmailId;
	}
	public void setPersonEmailId(String personEmailId) {
		this.personEmailId = personEmailId;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public Long getPersonMobilno() {
		return personMobilno;
	}
	public void setPersonMobilno(Long personMobilno) {
		this.personMobilno = personMobilno;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public Double getPaidamount() {
		return Paidamount;
	}
	public void setPaidamount(Double paidamount) {
		Paidamount = paidamount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
