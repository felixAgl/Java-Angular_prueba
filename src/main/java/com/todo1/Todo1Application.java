package com.todo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Todo1Application implements CommandLineRunner  {
	
	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(Todo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.execute("DROP TABLE PRODUCTOS IF EXISTS");
		template.execute("CREATE TABLE PRODUCTOS(id INTEGER(11) PRIMARY KEY auto_increment,camisas VARCHAR(255),vasos VARCHAR(255)) ");
		
		for (int i=0; i<3; i++) {
			template.execute("insert into productos(camisas)values('Camisas 000"+i+"')");
		}
		for (int i=0; i<3; i++) {
			template.execute("insert into productos(vasos)values('Vasos 000"+i+"')");
		}
		// TODO Auto-generated method stub
		
	}

}
