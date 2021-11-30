package com.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;


@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	void hello() throws Exception {
		RequestBuilder request = get("/hello");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("Hello, World", result.getResponse().getContentAsString());
	}
	
	public void testeHelloWithName() throws Exception {
		mvc.perform(get("/hello?nome=Mariana")).andExpect((ResultMatcher) content().string("Hello, Mari"));
	}
	
	
//	@Test
//	void hello() {
//		HelloController controller = new HelloController();
//		String response = controller.hello("World");
//		assertEquals("Hello world", response);
//	}
}
