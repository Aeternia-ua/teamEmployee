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
	static EmployeeList[] emplyeesArray;
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
	
	Arrays.sort(emplyeesArray, EmployeeList.CompareByName);
	for (EmployeeList employee : emplyeesArray) {
	System.out.println("Sorting by name : " + employee.getName() + " -> ID: " + employee.getId() + 
			" " + employee.getPosition() + " : " + employee.getSalary());
	}
	
	Arrays.sort(emplyeesArray, EmployeeList.CompareBySalary);
	for (EmployeeList employee : emplyeesArray) {
	System.out.println("Sorting by salary : " + employee.getName() + " -> ID: " + employee.getId() + 
			" " + employee.getPosition() + " : " + employee.getSalary());
	}
	
//	Arrays.sort(emplyeesArray, EmployeeList.CompareByPosition);
//	for (EmployeeList employee : emplyeesArray) {
//	System.out.println("Sorting by position : " + employee.getName() + " -> ID: " + employee.getId() + 
//			" " + employee.getPosition() + " : " + employee.getSalary());
//	}
//	Arrays.sort(emplyeesArray, EmployeeList.CompareById);
//	for (EmployeeList employee : emplyeesArray) {
//	System.out.println("Sorting by ID : " + employee.getName() + " -> ID: " + employee.getId() + 
//			" " + employee.getPosition() + " : " + employee.getSalary());
//	}


	}
	}
	
 

