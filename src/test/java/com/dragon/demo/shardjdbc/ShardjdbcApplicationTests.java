package com.dragon.demo.shardjdbc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;

import com.dragon.demo.shardjdbc.controller.UserController;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardjdbcApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	UserController userController;
	
	
	private MockHttpServletRequest request;    
	private MockHttpServletResponse response;  

	 @Before      
	  public void setUp(){      
	        request = new MockHttpServletRequest();        
	        request.setCharacterEncoding("UTF-8");        
	        response = new MockHttpServletResponse();  
	        MockHttpSession session = new MockHttpSession();
	        session.setAttribute("userId", "quincy.chen");
	        request.setSession(session);
	        
	  } 

    @After
    public void after () {}

    @Test
    public void runSomething() {
        Assert.assertEquals(1 + 1,2);
    }
    
    @Test
    public void insert() {
    	try {
    		
    		for(int i = 20;i < 30; i++) {
    			for(int j =20;j < 30; j ++) {
    				userController.updateTransactional(Long.valueOf(i), Long.valueOf(j), "nickName", "passWord", "userName");
    			}
    		}
    	
    		
		} catch (Exception e) {
			e.getMessage();
		}
    	
    }
	
}
