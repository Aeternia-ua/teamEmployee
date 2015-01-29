import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Employee extends EmployeeList {

	public static void main(String[] args) throws IOException, ParseException {
		
JSONParser parser = new JSONParser();	
ObjectMapper mapper = new ObjectMapper();
	String json = ((JSONArray) parser.parse(new FileReader(System.getProperty("user.dir") + "\\src\\" + "Employee1.json"))).toJSONString();
	 
	List<EmployeeList> employees = Arrays.asList(mapper.readValue(json, EmployeeList[].class));
		
	for (EmployeeList Employee : employees) {
		System.out.println("Employee name: " + Employee.getName() + ". ID: " +  Employee.getId() + ". position -> "
	+ Employee.getPosition() + ". salary: " + Employee.getSalary());
		}
	
	EmployeeList[] emplyeesArray = (EmployeeList[]) employees.toArray();
	Arrays.sort(emplyeesArray);
	
	System.out.println ("Employees sorted by salary: ");
	for (EmployeeList employee : emplyeesArray) {
		System.out.println(employee.getId() + employee.getName() + " -> " + employee.getPosition() + " : " + employee.getSalary());
	}
	

//	public List<Employee> sortByName (){
//	Collections.sort(employees, new Comparator <Employee>() {
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			 return o1.getName().compareTo(o2.getName());
//		}
//	});
//	return (List<Employee>) employees;
//	}
	}
	}
	
 

