package com.jdbcdemo;
import com.javatpoint.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		JdbcDaoImpl dao=(JdbcDaoImpl)ctx.getBean("jdbcDaoImpl");
		int status=dao.saveCircle(new Circle(2,"second circle"));
		System.out.println(status);
	}

}
