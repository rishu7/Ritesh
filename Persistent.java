package hibernate;

import java.util.List;

public class Persistent {
	
	private int id;
	private String company_name;
	private List<String> employee_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public List<String> getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(List<String> employee_name) {
		this.employee_name = employee_name;
	}
	
	
	}
