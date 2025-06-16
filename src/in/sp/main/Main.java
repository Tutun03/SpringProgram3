package in.sp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.student;

import org.springframework.context.ApplicationContext;
public class Main {

public static void main(String[] args) {
	String config_file="in/sp/resource/applicationContext.xml";
    ApplicationContext context= new ClassPathXmlApplicationContext(config_file);
    student std=(student)context.getBean("student");
    String s1=std.toString();
    System.out.println(s1);
}
}
