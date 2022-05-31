package site;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class pageController {
	
	@GetMapping("/")
	//@ResponseBody
	public String home(HttpServletRequest request, ModelMap modelMap) {
		String name = request.getParameter("name") != null && !request.getParameter("name").isEmpty()
				? request.getParameter("name") //ce qui ile faut afficher qd c vrai 
				: "World";
			    
		modelMap.put("name", name);
		System.out.println("\n\n\n"+ name +"\n\n\n");
		return "page/home";
	}

}
