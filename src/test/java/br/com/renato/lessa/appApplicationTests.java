package br.com.renato.lessa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.renato.lessa.appApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = appApplication.class)
@WebAppConfiguration
public class appApplicationTests {

	@Test
	public void contextLoads() {
	}

}
