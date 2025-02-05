package com.Yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 활용.
 */
public class EmpListExe implements EmpDAO {

	List<Employee> empList = new ArrayList<Employee>(); // 저장공간.
	
	public EmpListExe() {
		// 초기값.
		empList.add(new Employee(1001, "둘리", "432-1234"));
		empList.add(new Employee(1011, "도우넛", "432-1212"));
		empList.add(new Employee(1021, "또치", "432-2222"));
		empList.add(new Employee(1010, "고길동", "333-1212", "2000-01-01", 500));
	}

	@Override
	public boolean registerEmp(Employee emp) {
		return empList.add(emp); // 등록
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		for(int i = 0; i < empList.size(); i++) {
			// 사원번호 비교.
			if(empList.get(i).getEmpNo() == emp.getEmpNo()) {
				empList.get(i).setTelNo(emp.getTelNo());
				empList.get(i).setHireDate(emp.getHireDate());
				empList.get(i).setSalary(emp.getSalary());
				return true; // 정상수정.
			}
		}
		return false; // 수정 못함.
	}

	@Override
	public boolean removeEmp(int empNo) {
		for(int i = 0; i < empList.size(); i++) {
			if(empList.get(i).getEmpNo() == empNo) {
				empList.remove(i); // 삭제.
				return true;
			}
		}
		return false;
	}

	@Override
	public Employee[] search(Employee emp) { // sal 보다 급여가 많은...
		Employee[] result = new Employee[10];
		int idx = 0;
		
		for(int i = 0; i < empList.size(); i++) {
			if(empList.get(i).getSalary() >= emp.getSalary()) {
				result[idx] = empList.get(i);
				idx++; // 0부터 1씩 증가되도록.
			}
		}
		return result;
	}

}
