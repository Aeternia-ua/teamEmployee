import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Pars {
	final static String filePath = "D:\\LITS\\Eclipse_workspace\\TeamEmployee\\bin\\Employee1.json";
//	final static String filePath = "D:\\LITS\\Eclipse_workspace\\TeamEmployee\\bin\\Employee.json";
	
//	static public ArrayList reader() throws IOException, ParseException {
//	FileReader reader = new FileReader(filePath);
//	 JSONParser jsonParser = new JSONParser();
//	 JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
//	 
//	 JSONArray empl = (JSONArray) jsonObject.get("employees");
//	 System.out.println (empl);
//	empl.toArray();
//	ArrayList <Employee> list = new ArrayList <Employee> (empl);
//	 System.out.println (list.size());
//	 
//	EmployeeName names = new  EmployeeName ();
//	ArrayList empName = new ArrayList ();
//	ArrayList empId = new ArrayList ();
//	ArrayList empSalary = new ArrayList ();
//	ArrayList empPosition = new ArrayList ();
//	 Iterator it = list.iterator();
//	 while (it.hasNext()) {
//		JSONObject  n = (JSONObject) it.next();
//		 if (n.containsKey("name")) {
//			 empName.add(n.get("name").toString());
//////			 String temp = n.get("name").toString();
//////			 empName.add(temp);
//		 }  if 
//			 (n.containsKey("id")) {
//				empId.add(n.get("id").toString());
//			
//		 }  if 
//				(n.containsKey("salary")) {
//			 		empSalary.add(n.get("salary").toString());
////					 String temp = n.get("salary").toString();
////					 System.out.println (temp);
////					 empSalary.add(temp);
//				
//			 }  if 
//					(n.containsKey("position")) {
//				 		empPosition.add(n.get("position").toString());
////							 String temp = n.get("position").toString();
////							 System.out.println (temp);
////							 empPosition.add(temp);
//					 } else
//						 continue;
//
//	 }
//	 return empName;
//	 return empId;
//	 return empSalary;
//	 return empPosition;

//	 Collections.sort(employees, new Pars());
//		System.out.println("По имени:");
//		System.out.println (employees.get(0));
//	      
//     for(Employee x: employees){
//         System.out.println("По имени:" + x.getName());
     } 



		



