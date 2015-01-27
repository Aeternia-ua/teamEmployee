import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;


public class JsonReports {
//	final static String filePath = "D:\\LITS\\Eclipse_workspace\\TeamEmployee\\bin\\Employee.json";
	final static String filePath = "D:\\LITS\\Eclipse_workspace\\TeamEmployee\\bin\\Employee1.json";
	public static void main(String[] args) throws IOException, ParseException {
		
		
		 FileReader reader = new FileReader(filePath);
		 JSONParser jsonParser = new JSONParser();
		 JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
		 
 	 JSONArray empl = (JSONArray) jsonObject.get("employees");
		 System.out.println (empl);
		empl.toArray();
		ArrayList <Employee> list = new ArrayList <Employee> (empl);
		 System.out.println (list.size());
		 
		EmployeeName names = new  EmployeeName ();
		ArrayList  empName = new ArrayList ();
		ArrayList empId = new ArrayList ();
		ArrayList empSalary = new ArrayList ();
		ArrayList empPosition = new ArrayList ();
		 Iterator it = list.iterator();
		 while (it.hasNext()) {
			JSONObject  n = (JSONObject) it.next();
			 if (n.containsKey("name")) {
				 empName.add(n.get("name").toString());

			 }  if 
				 (n.containsKey("id")) {
					empId.add(n.get("id").toString());
				
			 }  if 
					(n.containsKey("salary")) {
				 		empSalary.add(n.get("salary").toString());
					
				 }  if 
						(n.containsKey("position")) {
					 		empPosition.add(n.get("position").toString());
						
						 } else
							 continue;

		 }
		 System.out.println (empName);
		 System.out.println (empId);
		 System.out.println (empSalary);
		 System.out.println (empPosition);
	}		 

//	   Collections.sort(empName, new ComparatorValue());
//       
//       for(Student x: empName){
//           System.out.println(x.getName()+" "+x.getValue());
//       }
	
//			Collections.sort(employees, new Employee ());
//			System.out.println("По имени:");
//			System.out.println (employees.get(0));
//		      
//	        for(Employee x: employees){
//	            System.out.println("По имени:" + x.getName());
//	        } 
	 
	
       

//		 ArrayList <Employee> employees = new ArrayList ();
//			empTemp.toArray();
//			for(int i = 0; i < empTemp.size(); i++) {
//				employees.add((Employee) empTemp.get(i));
//			}
//			System.out.println (employees);

		 
	
	
		
//	JsonReader reader = new JsonReader(new FileReader(filePath));	
//		Gson gson = new Gson();
//			 
//			EmployeeList empl = gson.fromJson (reader, EmployeeList.class);
//			 System.out.println (empl);
//			 empl.getEmployees();
//			List<Employee> str =  empl.getEmployees();
//			 System.out.println (str.size());
//			 ArrayList <Employee> list = new ArrayList <Employee>(empl.getEmployees());
//			 System.out.println (list.size());
//		       String name =  list).getName();
	
//			 System.out.println("The first name is: " + firstName);
//			
//			
//			
//				
//				 String name;
//					
//				System.out.println (list.size());
				
				

	
//	}
//	public int compare(Employee o1, Employee o2) {
//		  return o1.getName().compareTo(o2.getName());
//	}
}


