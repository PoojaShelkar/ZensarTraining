package Containtment;

public class Department {
	private int deptid;
	private String deptname;
	public Department(int deptid, String deptname) {
	    
		this.deptid = deptid;
		this.deptname = deptname;
	}
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	

}

