package com.kishoreb.Student.Management.System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kishoreb.Student.Management.System.entity.Student_database;
import com.kishoreb.Student.Management.System.repo.Students_infos;

@Component
public class Business_Logic implements Student_Datas {

	@Autowired
	Students_infos info;

	@Override
	public List<Student_database> getAllStudents() {
		// TODO Auto-generated method stub
		return info.findAll();
	}

	@Override
	public Student_database saveData(Student_database sb) {
		// TODO Auto-generated method stub
		return info.save(sb);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		info.deleteById(id);
		
	}

	@Override
	public Student_database getStudentDatas(int id) {
		// TODO Auto-generated method stub
		Optional<Student_database>dbs=info.findById(id);
		if(dbs.isPresent())
		{
			return dbs.get();
		}
		return dbs.get();
		
	}

	@Override
	public Student_database updateStudentDatas(Student_database db, int id) {
		// TODO Auto-generated method stub
		Student_database base=info.findById(id).get();
		base.setName(db.getName());
		base.setDept(db.getDept());
		base.setMail_id(db.getMail_id());
		base.setPending(db.getPending());
		base.setStatus(db.getStatus());
		base.setStd(db.getStd());
		System.out.println("Triggered");
		return info.save(base);

	}
	
}
