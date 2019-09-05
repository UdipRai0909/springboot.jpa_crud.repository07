package com.sursatech.people_mgmt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.sursatech.people_mgmt.entities.Person;
import com.sursatech.people_mgmt.service.PeopleMgmtService;


@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private PeopleMgmtService peopleMgmtService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> listPerson = peopleMgmtService.findByLastName("User", PageRequest.of(1, 3, Direction.DESC, "lastName"));
		listPerson.forEach(System.out::println);
	}
}
