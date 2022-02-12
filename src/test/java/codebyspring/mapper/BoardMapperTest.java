package codebyspring.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import codebyspring.AppMainTest;
import codebyspring.model.Board;

public class BoardMapperTest extends AppMainTest{

	@Autowired
	BoardMapper mapper;
	
	@Autowired
	DataSource dataSource; 
	
	@Before
	public void before() throws IOException, SQLException {
		Reader reader = Resources.getResourceAsReader("sql/test.sql");
		ScriptRunner runner = new ScriptRunner(dataSource.getConnection());
		runner.runScript(reader);
	}
	
	@Test
	public void getListTest() {
		List<Board> list = mapper.getList();
		assertEquals(4, list.size());
		System.out.println(list);
	}
}
