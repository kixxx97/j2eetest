package ph.com.alliance.controller.view;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import ph.com.alliance.service.impl.DBTransactionTestServiceImpl;

@Controller
@RequestMapping("/modulename")
public class TestController {
	
	@Autowired
	DBTransactionTestServiceImpl s;
	
	@RequestMapping(value = "/calculator", method = RequestMethod.GET)
	public String viewCalculator(HttpServletRequest request,
			HttpServletResponse response, ModelMap map) {
		// System.out.println("@/modulename/calculator MODULE VIEW CONTROLLER CALLED.");
		Double result = 0.00;
		boolean error = false;
		String ans;
		Integer clr=1;
		if (null != request.getParameter("num1")
				&& null != request.getParameter("num2")
				&& null != request.getParameter("operation")
				&& clr.toString().equals(request.getParameter("clear"))==false){
			Double num1 = Double.parseDouble(request.getParameter("num1"));
			Double num2 = Double.parseDouble(request.getParameter("num2"));
			char op = request.getParameter("operation").charAt(0);
			System.out.println("This is Number 1: " + num1);
			System.out.println("This is Number 2: " + num2);
			switch (op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if (0 != num2) {
					result = num1 / num2;
				} else {
					error = true;
				}
				break;
			}
			ans = result.toString();
			if (true == error) {
				ans = "Undefined";
			}
			System.out.println("The Result is " + ans);

			map.put("num1", num1);
			map.put("num2", num2);
			map.put("operation", op);
			map.put("ans", ans);
		}
		return "calculator";
	}
	
	/*@RequestMapping(value = "/tables", method = RequestMethod.GET)
    public String viewTables(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/tables MODULE VIEW CONTROLLER CALLED.");
    	
    	List<Anothertable> tables = s.showAll();
    	
    	//System.out.println(tables.toString());
    	map.put("tables", tables);
    	return "tables";
	}
	
	@RequestMapping(value = "/tables/delete", method = RequestMethod.GET)
    public String delTables(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/tables MODULE VIEW CONTROLLER CALLED.");
    	
    	String id = request.getParameter("id");
    	//List<Anothertable> tables = s.deleteTable(t);
    	
    	//System.out.println(tables.toString());
    	//map.put("tables", tables);
    	return "tables";
	}
	
	@RequestMapping(value = "/tables/searchId", method = RequestMethod.GET)
    public String searchTablesId(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/tables MODULE VIEW CONTROLLER CALLED.");
    	
    	Integer id = Integer.parseInt(request.getParameter("id"));
    	List<Anothertable> t = null;
    	
    	t = s.searchByID(id);
    	
    	map.put("tables", t);
    	return "tables";
	}
	
	@RequestMapping(value = "/tables/searchName", method = RequestMethod.GET)
    public String searchTablesName(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/tables MODULE VIEW CONTROLLER CALLED.");
    	
    	String name = request.getParameter("name");
    	List<Anothertable> t = null;
    	
    	t = s.searchByName(name);
    	
    	map.put("tables", t);
    	return "tables";
	}
	
	@RequestMapping(value = "/tables/searchAge", method = RequestMethod.GET)
    public String searchTablesAge(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/tables MODULE VIEW CONTROLLER CALLED.");
    	Integer age1, age2;
    	
    	if(true!=request.getParameter("age1").isEmpty()){
    		age1 = Integer.parseInt(request.getParameter("age1"));
    	}else{
    		age1=0;
    	}
    	
    	if(true!=request.getParameter("age2").isEmpty()){
    		age2 = Integer.parseInt(request.getParameter("age2"));
    	}else{
    		age2=999;
    	}
    	List<Anothertable> t = null;
    	
    	
    	t = s.searchByAge(age1, age2);
    	
    	map.put("tables", t);
    	return "tables";
	}
	
	@RequestMapping(value = "/tables/deleteTable", method = RequestMethod.GET)
    public String deleteTable(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/tables MODULE VIEW CONTROLLER CALLED.");
    	Integer id = null;
    	List<Anothertable> t = null;
    	
    	if(null!=request.getParameter("id")){
    		id = Integer.parseInt(request.getParameter("id"));
    		t = null;
        	
        	s.deleteTable(id);
        	t = s.showAll();
    	}
    	
    	map.put("tables", t);
    	return "tables";
	}
	
	@RequestMapping(value = "/tables/insertTable", method = RequestMethod.GET)
    public String insertTable(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/tables MODULE VIEW CONTROLLER CALLED.");
    	Integer id, age = null;
    	String name;
    	List<Anothertable> t = null;
    	Anothertable newTable = null;
    	
    	if(null!=request.getParameter("id") && null!=request.getParameter("name") && null!=request.getParameter("age") 
    			&& request.getParameter("id").equals("")==false && request.getParameter("age").equals("")==false && request.getParameter("name").equals("")==false){
    		id = Integer.parseInt(request.getParameter("id"));
    		age = Integer.parseInt(request.getParameter("age"));
    		name = request.getParameter("name");
    		t = null;
    		
    		newTable = new Anothertable();
        	
    		newTable.setId(id);
    		newTable.setName(name);
    		newTable.setAge(age);
    		
    		boolean success = s.createTable(newTable);
        	
    	}
    	t = s.showAll();
    	
    	map.put("tables", t);
    	return "tables";
	}
	
	@RequestMapping(value = "/tables/updateTable", method = RequestMethod.GET)
    public String updateTable(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/tables MODULE VIEW CONTROLLER CALLED.");
    	Integer id, age = null;
    	String name;
    	List<Anothertable> t = null;
    	Anothertable newTable = null;
    	
    	if(null != request.getParameter("name") && null != request.getParameter("age") && request.getParameter("age").equals("")==false && request.getParameter("name").equals("")==false){
    		id = Integer.parseInt(request.getParameter("id"));
    		age = Integer.parseInt(request.getParameter("age"));
    		name = request.getParameter("name");
    		t = null;
    		
    		newTable = new Anothertable();
        	newTable.setId(id);
        	newTable.setName(name);
        	newTable.setAge(age);
    		
    		newTable = s.updateTable(newTable);
        	
    	}
    	
    	t = s.showAll();
    	map.put("tables", t);
    	return "tables";
	}*/
}
