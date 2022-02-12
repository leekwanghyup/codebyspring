package codebyspring.config;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import codebyspring.AppMainTest;

public class RootConfigTest extends AppMainTest{
	
	@Autowired
	private DataSource dataSource; 

	@Test
	public void dataSourceTest() {
		assertNotNull(dataSource);
	}

}
