package com.bstc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bstc.bean.Person;
import com.bstc.dao.TestDao;

@Service
public class TestService {
	
	@Autowired
	private TestDao testDao;
	
	public int getNum() {
		
		int a = testDao.getNum();
		return a;
	}
	
	
	public Person getPerson(){
		Person p = testDao.getPerson();
		return p;
	}
}
