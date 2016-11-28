package com.szu.subject.account.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.szu.subject.domains.Course;
import com.szu.subject.domains.Student;

@Mapper
public interface StudentMapper {

public Student getStudentByPK(Long id);
	
	public int createStudent(Student Student);
	
	public int updateStudent(Student Student);
	
	public int deleteStudent(Long id);
	
	public int updateCourses(Map map);
	
	public int deleteCourses(Map map);
	
	public List<Course> getCourses(Long id);

	public int batchCreatStudent(List<Student> Students);

	public int batchUpdateStudent(List<Student> Students);

	public int batchDeleteStudent(List<Long> ids);
}
