 package com.hurui.core.design.demeter.improve;
/**
 * @title 根据迪米特法则改进，不能有陌生朋友的产生
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @title 客户端
 * @author ruihu
 *
 */
public class Demeter {

	public static void main(String[] args) {
		SchoolManager schoolManager = new SchoolManager();
		schoolManager.printIds();
		CollegeManager collegeManager = new CollegeManager();
		collegeManager.printCollegeIds();

	}

}

/**
 * 学校总部员工
 * @author ruihu
 *
 */
class Employee {
	
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
}

/**
 * 学院的员工
 * @author ruihu
 *
 */
class CollegeEmployee {
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
}

class CollegeManager {
	/**
	 * 返回学院的所有员工
	 * @return
	 */
	public List<CollegeEmployee> getAllEmployee(){
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for(int i=0;i<10;i++) {//增加了10个员工
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("学院的id:" + i);
			list.add(emp);
		}
		return list;
	}
	
	public void printCollegeIds() {
		List<CollegeEmployee> list1 = this.getAllEmployee();
		System.out.println("--------学院员工--------");
		for(CollegeEmployee e:list1) {
			System.out.println(e.getId());
		}
	}
}

//学校的管理类
//这个类的直接朋友：Employee，CollegeManager 方法参数
//CollegeEmployee 不是直接朋友,违背了迪米特原则
class SchoolManager {
	
	public List<Employee> getAllEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		for(int i=0;i<5;i++) {
			Employee emp = new Employee();
			emp.setId("学校的总部员工id:" + i);
			list.add(emp);
		}
		return list;
	}
	
	public void printIds() {
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("-------学校总部员工----------");
		for(Employee e:list2) {
			System.out.println(e.getId());
		}
	}
	
	
	
	
}
