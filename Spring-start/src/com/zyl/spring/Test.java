package com.zyl.spring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ClassPathXmlApplicationContext ctx;
	
	 private static  void  print(Object object) {
         System.out.println(object);		
	}
	 public static void test1() {
		 Users users =new Users();
		 users.setName("teacher");
		 users.setAddress("hefei");
		 users.setMemo("This is my first spring project");
		print(users);
		
	}
	//ʹ��spring
	 public static void test2() {
		 //ʹ��ClassPathXmlApplicationContext�ķ�ʽʵ����spring��������
		 ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��ApplicationContext��getBean��������������ID����ȡbean
		 Users users =ctx.getBean("users",Users.class);
		print(users);
	}
	public static void main(String[] args) {
		test1();
		test2();
	

	}

}
