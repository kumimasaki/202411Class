package practice.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	// ログイン画面を表示
	@GetMapping("/login")
	public String getLoginPage(Model model) {
		model.addAttribute("error", false);
		return "login.html";
	}
	
	// ログイン画面からデータを送る
	@PostMapping("/login/process")
	public String login(@RequestParam String email,
						@RequestParam String password, Model model) {
		String[] test = {"aa", "bb", "cc", "dd"};
		// もしメールアドレスが「test@test.com」で
		// かつパスワードが「admin」だった場合は「success.html」を表示
		if(email.equals("test@test.com") && password.equals("admin")) {
			model.addAttribute("userEmail", email);
			model.addAttribute("userPassword", password);
			model.addAttribute("array", test);
			return "success.html";
		} else {
			model.addAttribute("error", true);
			return "login.html";
		}
		
	}
	
//	@PostMapping("/login/process")
//	public ModelAndView login(@RequestParam String email,
//			@RequestParam String password, ModelAndView mav) {
//		mav.addObject("userEmail", email);
//		mav.addObject("userPassword", password);
//		mav.setViewName("success.html");
//		return mav;
//	}
	
}
