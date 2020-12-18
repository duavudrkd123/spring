package co.company.spring;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.company.spring.config.DBConfiguration;
import co.company.spring.config.MybatisConfiguration;
import co.company.spring.dao.Emp;
import co.company.spring.dao.EmpMapper;
import co.company.spring.dao.EmpSearch;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DBConfiguration.class, MybatisConfiguration.class })
public class EmpDAOMapperClient {
	@Autowired
	EmpMapper empDAO;

//@Test
	public void empdaotest() {
		EmpSearch empvo = new EmpSearch();
		empvo.setFirstName("E");
		empvo.setDepartmentId("60");
		empvo.setMaxSalary(10000);
		empvo.setMinSalary(7000);
		List<Emp> list = empDAO.getEmpList(empvo);
		for (Emp emp : list) {
			System.out.println(emp.getEmployeeId() + ":" + emp.getFirstName() + ":" + emp.getDepartmentId() + ":"
					+ emp.getJobId() + ":" + emp.getSalary());
		}
	}
// 부서별 사원수 부서명 사원수
	@Test
	public void getStat() {
		List<Map<String, Object>> list = empDAO.getStatDept();
		System.out.println(list.get(0).get("deptName"));
	}

//전체 레코드 건수 조회
	// @Test
	public void countrecord() {
		EmpSearch empvo = new EmpSearch();
		empvo.setFirstName("E");
		empvo.setDepartmentId("60");
		empvo.setMaxSalary(10000);
		empvo.setMinSalary(7000);

		System.out.println(empvo);
	}

//업데이트 조회
//단건조회
//@Test
	public void updateTest() {
		Emp empvo = new Emp();
		empvo.setEmployeeId("102");
		System.out.println(empDAO.getEmp(empvo));
		empvo.setFirstName("hong");
		empDAO.updateEmp(empvo);
		System.out.println(empDAO.getEmp(empvo));
	}

//값 넣기
//@Test
	public void INserTest() {
		Emp emp = new Emp();
		emp.setFirstName("와우");
		emp.setLastName("lokkd");
		emp.setJobId("IT_PROG");
		emp.setEmail("dskfdssl@ddk.dk");
		emp.setHireDate(new Date(System.currentTimeMillis()));
		empDAO.insertEmp(emp);
		System.out.println(emp.getEmployeeId());

	}

	// 프로시저로 값넣기
	// @Test
	public void InsertProcTest() {
		Emp emp = new Emp();
		emp.setLastName("lokkd");
		emp.setJobId("IT_PROG");
		emp.setEmail("dskfdssl@ddk.dk");
		empDAO.insertEmpProc(emp);
		System.out.println(emp.getEmployeeId() + ":" + emp.getMsg());
	}

//값 삭제하기
	// @Test
	public void deleteMutiTest() {
		EmpSearch emp = new EmpSearch();
		emp.setList(new String[] { "1001", "1002", "1003" });
		empDAO.deleteMutiEmp(emp);
	}
}
