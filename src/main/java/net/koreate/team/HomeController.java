package net.koreate.team;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
=======
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> branch 'master' of https://github.com/kikuen/SpringGitTeamTest2026.git

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
}
