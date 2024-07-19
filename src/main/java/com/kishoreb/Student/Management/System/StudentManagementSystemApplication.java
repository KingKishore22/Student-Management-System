package com.kishoreb.Student.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.CommandLinePropertySource;

import com.kishoreb.Student.Management.System.entity.Student_database;
import com.kishoreb.Student.Management.System.repo.Students_infos;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	Students_infos in;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student_database db=new Student_database();
		db.setDept("Bio Maths");
		db.setName("Kishore B");
		db.setStatus("not paid");
		db.setPending("20,000");
		db.setStd("12th");
		db.setMail_id("kishoreb12@gmail.com");
	//	in.save(db);
		
	}

}
