package com.szu.subject.account.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.szu.subject.account.service.AccountService;
import com.szu.subject.domains.Course;
import com.szu.subject.domains.User;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping(method = RequestMethod.POST, value = "remove-courses",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public int removeCourse(Map idMap){
		return accountService.removeCourse(idMap);
	}

	@RequestMapping(method = RequestMethod.POST, value = "add-courses",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public int addCourse(Map idMap){
		return accountService.addCourse(idMap);
	}

	@RequestMapping(method = RequestMethod.POST, value = "get-courses",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> getCourses(Long id){
		return accountService.getCourses(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "get-courses-by-pk",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User getByPK(Long id){
		return accountService.getByPK(id);
	}
}
