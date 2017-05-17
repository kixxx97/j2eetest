package ph.com.alliance.controller.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ph.com.alliance.entity.User;

/**
 * Example controller class that hadles static view requests.
 * All requests that returns pages (html, xhtml, jsp, jspx, etc.) is handled here. 
 *
 */
@Controller
@RequestMapping("/modulename")
public class GaiusModuleViewController {
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
    
    /**
     * 
     * @param request
     * @param response
     * @param map
     * @return
     */
    @RequestMapping(value = "/Gaiuscalculator", method = RequestMethod.GET)
    public String useCalculator(HttpServletRequest request, HttpServletResponse response, ModelMap map, User op) {
    	System.out.println("@/modulename/calculator MODULE VIEW CONTROLLER CALLED.");
        String operation = op.getOp();
        int num1 = op.getNum1(), num2 = op.getNum2();
        
        
        System.out.println("This is num1: "+num1);
        System.out.println("This is num2: "+num2);
        System.out.println("This is operator: "+operation);
        
        
        if ((operation != " " && null != operation)){
            switch (operation){
                case "add": 
                    op.setResult(num1 + num2);break;
                case "sub": 
                    op.setResult(num1 - num2);break;
                case "mul": 
                    op.setResult(num1 * num2);break;
                case "div": 
                    op.setResult(num1 / num2);break;
            }       
        }
        
            System.out.println("This is result: "+op.getResult());
        map.put("myResult",op.getResult());
        
        
        return "Gaiuscalculator";
    }
    
    /**
     * 
     * @param request
     * @param response
     * @param map
     * @return
     */
    }
