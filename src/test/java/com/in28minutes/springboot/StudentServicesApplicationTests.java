package com.in28minutes.springboot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class StudentServicesApplicationTests {

	@BeforeClass  
    	public static void setUpBeforeClass() throws Exception {  
        	System.out.println("before class");  
    	}

	@Test
	public void contextLoads() {
		System.out.println("dummy testcase");
	}

	@AfterClass
	public static void setUpAfterClass() throws Exception {
		System.out.println("after class");
	}

}
