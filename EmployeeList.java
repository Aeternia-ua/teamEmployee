public class EmployeeList implements Comparable<EmployeeList> {
	
	private long id;
	private String name;
	private String position;
	private long salary;
	
	public EmployeeList() {
		
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public long getSalary() {
		return salary;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	@Override
	public int compareTo(EmployeeList o) {
		return this.salary < o.getSalary() ? -1 :
			this.salary > o.getSalary() ? 1 : 0;
	}
	

//	public EmployeeList sortById (){
//		@Override
//	public int compareTo(EmployeeList o) {
//		return this.id < o.getId() ? -1 :
//			this.id > o.getId() ? 1 : 0;
//	  }
//	}
//	public List<Employee> sortByName (){
	
}
