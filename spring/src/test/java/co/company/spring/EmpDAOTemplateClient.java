package co.company.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.company.spring.config.DBConfiguration;
import co.company.spring.dao.Emp;
import co.company.spring.dao.EmpDAOJdbcTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DBConfiguration.class })
public class EmpDAOTemplateClient {

	@Autowired EmpDAOJdbcTemplate empDao;
	@Test
	public void empdaotest() {
		System.out.println("꺄약"+empDao.getList());
	}
	@Test
	public void inserttest() {
		Emp emp = new Emp();
		emp.setEmployeeId("12192");
		emp.setLastName("ypg");
		emp.setEmail("a@a.a");
		empDao.insert(emp);
	}
}
