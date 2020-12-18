package co.company.spring.dao;

import java.util.List;
import java.util.Map;

public interface EmpMapper {
	
	public List<Emp> getEmpList(EmpSearch emp);
	public int getCount(EmpSearch emp); //천체조회랑 건수조회랑 맞춰줘야된다
//위에 두개는 항상 묶어서 사용한다.
	public int updateEmp(Emp emp);
	public Emp getEmp(Emp emp); //result type이 emp라서 emp로 적어준다
	public int insertEmp(Emp emp);
	public void insertEmpProc(Emp emp);
	public int deleteEmp(Emp emp);
	public int deleteMutiEmp(EmpSearch emp);
	public List<Map<String, Object>> getStatDept();
}
