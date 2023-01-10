package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.StudentEntity;

public class StudentDao {

	private HibernateTemplate hibernateTemplate; 
	
	//Save Student
	@Transactional
	public int insert (StudentEntity student) {
		
		//insert
		Integer i = (Integer)this.hibernateTemplate.save(student);
		
		return i;
	}
	
	//get the single data(Object)
	
	public StudentEntity getStudentEntity(int id) {
		StudentEntity student = this.hibernateTemplate.get(StudentEntity.class, id);
		return student;
	}
	//get all records
	public List<StudentEntity> getAllStudents(){
		List<StudentEntity> list = this.hibernateTemplate.loadAll(StudentEntity.class);
		return list;
	}
	
	//Deleting the record
	@Transactional
	public void deleteStudent(int id) {
		StudentEntity student=this.hibernateTemplate.get(StudentEntity.class, id);
		this.hibernateTemplate.delete(student);
	}
	
	//updating record
	@Transactional
	public void updateStudent(StudentEntity student) {
		this.hibernateTemplate.update(student);
	}
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
