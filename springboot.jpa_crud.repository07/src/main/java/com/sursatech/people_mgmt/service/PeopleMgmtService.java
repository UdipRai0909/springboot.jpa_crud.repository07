package com.sursatech.people_mgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.sursatech.people_mgmt.dao.PeopleMgmtDao;
import com.sursatech.people_mgmt.entities.Person;

@Service
public class PeopleMgmtService {

	@Autowired
	private PeopleMgmtDao peoplMgmtDao;
	
	public List<Person> findByLastName(String lastName, PageRequest pageRequest) {
		return peoplMgmtDao.findByLastName(lastName, pageRequest);
	}

}
