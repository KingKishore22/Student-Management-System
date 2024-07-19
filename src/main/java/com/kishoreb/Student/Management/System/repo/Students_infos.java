package com.kishoreb.Student.Management.System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishoreb.Student.Management.System.entity.Student_database;

public interface Students_infos extends JpaRepository<Student_database,Integer> {

}
