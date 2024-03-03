package com.nabeel.cicd.demo;

import com.nabeel.cicd.demo.controller.DemoController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class DemoApplicationTests {

	@InjectMocks
	private DemoController demoController;

	@Test
	void contextLoads() {
	}
	@Test
	public void testWelcomeMessage(){
		String inp = "Hi welcome to demo controller ,";
		String inputMessage = "nabeel";
		ResponseEntity<String> response =  demoController.getWelcomeMessage(inputMessage);
		Assertions.assertEquals(inp+inputMessage,response.getBody());
	}


}
