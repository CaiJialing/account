package com.szu.subject.account.service;

import java.util.List;
import java.util.Map;

import com.szu.subject.domains.Course;
import com.szu.subject.domains.User;

/**
 * account 的service层
 * @author Shenxiaolin
 *
 */
public interface AccountService {

	/**
	 * 通过id获得账户信息
	 * @param id 账户id
	 * @return
	 */
	public User getByPK(Long id);
	
	/**
	 * 通过学生地获得选课情况
	 * @param id 学生id
	 * @return
	 */
	public List<Course> getCourses(Long id);
	
	/**
	 * 选课
	 * @param idMap
	 * @return
	 */
	public int addCourse(Map idMap);
	
	/**
	 * 退课
	 * @param idMap
	 * @return
	 */
	public int removeCourse(Map idMap);
	
	/**
	 * 判断选的课程是否冲突
	 * @param timeId
	 * @param newTimeId
	 * @return
	 */
	public boolean isConflict(List<Long> timeId,Long newTimeId);
	
	
	public User creatUser(User user);
	
	public User updateUser(User user);
	
	public int deleteUser(Long id);
	
	public List<User> batchCreatUser(List<User> users);
	
	public List<User> batchUpdateUser(List<User> users);
	
	public int batchDeleteUser(List<Long> ids);
}
