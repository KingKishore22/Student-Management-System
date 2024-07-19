package com.kishoreb.Student.Management.System.entity;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Column;

@Controller
public class Model_class {

	int id;
	String name="Kishore B";
	String mail_id="kishore23@gmail.com";
	String std="12th";
	String dept="Bio Maths";
	String status="not paid";
	String pending="40,000";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPending() {
		return pending;
	}
	public void setPending(String pending) {
		this.pending = pending;
	}

	
}
