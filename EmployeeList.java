import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;


public class EmployeeList {

	    private List<Employee> employees = new ArrayList<Employee>();
	    EmployeeList() {
	    }
	   
		public List<Employee> getEmployees() {
	        return employees;
	    }
	    public void setEmployees(List<Employee> employees) {
	        this.employees = employees;
	    }

}
