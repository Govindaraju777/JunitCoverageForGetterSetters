package com.friends.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.test.junit.Employee;


@RunWith(JUnit4.class)
public class EmployeeTest {
	Employee employee = new Employee();
	
	
	@Test
	public void testAssertFalseWithMessage() {
		//assertTrue(true);
		//employee.setName("test");
		
		//System.out.println("employee name ;" + employee.getName());
		//assertEquals("test", employee.getName());
	}
}
