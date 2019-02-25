package com.jdbcdemo;
import com.javatpoint.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcDaoImpl {
	
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}


public int saveCircle(Circle circle) {
	String sql="insert into circle values("+circle.getId()+",'"+circle.getName()+"')";
	return jdbcTemplate.update(sql);
}



}
