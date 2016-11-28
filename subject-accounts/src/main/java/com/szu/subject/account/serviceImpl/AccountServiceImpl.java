package com.szu.subject.account.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szu.subject.account.mapper.UserMapper;
import com.szu.subject.account.service.AccountService;
import com.szu.subject.domains.Course;
import com.szu.subject.domains.User;

/**
 * account的service层的实际实现类
 * @author Shenxiaolin
 *
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public User getByPK(Long id) {
		return userMapper.getUserByPK(id);
	}

	@Override
	public List<Course> getCourses(Long id) {
		return userMapper.getCourses(id);
	}

	@Transactional
	@Override
	public int addCourse(Map idMap) {
		return userMapper.updateCourses(idMap);
	}

	@Transactional
	@Override
	public int removeCourse(Map idMap) {
		return userMapper.updateCourses(idMap);
	}

	@Override
	public boolean isConflict(List<Long> timeId, Long newTimeId) {
		return timeId.contains(newTimeId);
	}

	@Transactional
	@Override
	public User creatUser(User user) {
		userMapper.createUser(user);
		return user;
	}

	@Transactional
	@Override
	public User updateUser(User user) {
		userMapper.updateUser(user);
		return user;
	}

	@Transactional
	@Override
	public int deleteUser(Long id) {
		return userMapper.deleteUser(id);
	}

	@Transactional
	@Override
	public List<User> batchCreatUser(List<User> users) {
		userMapper.batchCreatUser(users);
		return users;
	}

	@Transactional
	@Override
	public List<User> batchUpdateUser(List<User> users) {
		userMapper.batchUpdateUser(users);
		return users;
	}

	@Transactional
	@Override
	public int batchDeleteUser(List<Long> ids) {
		return userMapper.batchDeleteUser(ids);
	}

	
}
