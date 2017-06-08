package com.personal.app;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HomeControllerTest {
	@Test
	public void testHomePage() throws Exception{
		HomeController controller = new HomeController();
		MockMvc mvc = MockMvcBuilders.standaloneSetup(controller).build();
		mvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("home"));
	}
}
