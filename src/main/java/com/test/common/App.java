package com.test.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.test.dao.JobsDAO;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        JobsDAO jobsDAO = (JobsDAO) context.getBean("jobsDAO");
//        Customer customer = new Customer(1, "mkyong",28);
//        customerDAO.insert(customer);
//    	
//        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(jobsDAO.getAllJobs());
        
    }
}
