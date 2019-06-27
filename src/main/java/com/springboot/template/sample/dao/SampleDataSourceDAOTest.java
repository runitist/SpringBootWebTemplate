package com.springboot.template.sample.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/* before the test. 
 * 1. install mariadb
 * 2. create user 'test'(password : 'test')
 * 3. create database 'test' 
 * 4. create table 'test'(testint int primary key, teststring varchar(30))
 * 5. insert into test values (1, 'test') 
*/

@Repository
public class SampleDataSourceDAOTest {
	@Autowired JdbcTemplate jt;
	  
	  public List<Map<String, ?>> selectAll() {
	    return jt.query("select * from test", (rs, rowNum) -> {
	      Map<String, Object> mss = new HashMap<>();
	      mss.put("testint", rs.getInt(1));
	      mss.put("teststring", rs.getString(2));
	      return mss;
	    });
	  }
}
