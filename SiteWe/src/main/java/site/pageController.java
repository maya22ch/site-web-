package site;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class pageController {
	
	 // cela permet d afficher directement hello world sur la page 
	
/*	 @GetMapping("/")
	 @ResponseBody // 
	 public String home(){
		 return " <h1> hello world </h1>"; // on peut mettre notre code html !
	 } 
	
	
	// Accéder à la page home qui est ds le folder page ds templates 
	 @GetMapping("/")
	 public String home(){
		 return "page/home";
	} */
	 
	/* avec JAVA EE 
	 * 
	@GetMapping("/")
	public String home(HttpServletRequest request, ModelMap modelMap) {
		String name = request.getParameter("name") != null && !request.getParameter("name").isEmpty()
				? request.getParameter("name") //ce qui ile faut afficher qd c vrai 
				: "World";
			    
		modelMap.put("name", name);
		System.out.println("\n\n\n"+ name +"\n\n\n");
		return "page/home";
	}
	
	// en utilisant une annotation spring 
	// required=false :: le param n est pas obligatoire
	// defaultValue :: valeur par défaut si le param n est pas renseigné 
	// changer le port dans application.properties :: server.port=3000 par exemple 
	// on peut changer le fichier propeties en fivhier yml  
	*/
	@GetMapping("/")
	public String home(@RequestParam(required=false, defaultValue="World") String name , ModelMap modelMap) {
		modelMap.put("name", name);
		System.out.println("\n\n\n"+ name +"\n\n\n");
		return "page/home"; 
	}
}

