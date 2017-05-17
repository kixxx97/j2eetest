package ph.com.alliance.controller.view;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ph.com.alliance.entity.Account;
import ph.com.alliance.service.AtesService;

/**
 * Example controller class that handles request for the application root.
 * 
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	AtesService ateService;
	
    @RequestMapping(method=RequestMethod.GET)
    public String loadMainMenuIndex(HttpServletRequest request, HttpServletResponse response, ModelMap map){
    	 	
		return "/index";
    }
    
    @RequestMapping(value= "/data", method=RequestMethod.GET)
    public String viewTables(HttpServletRequest request, HttpServletResponse response, ModelMap map){
    	List<Account> accList = null;
    	
    	accList = ateService.getAllAccounts(); //getAllParticipants();
    	
    	map.put("accList", accList);
    	
		return "/data";
    }
    
    @RequestMapping(value= "/data/add", method=RequestMethod.GET)
    public String viewAllAccounts(HttpServletRequest request, HttpServletResponse response, ModelMap map){
    	List<Account> accList = null;
    	
    	accList = ateService.getAllAccounts(); //getAllParticipants();
    	
    	map.put("accList", accList);
    	
		return "/data";
    }

}
