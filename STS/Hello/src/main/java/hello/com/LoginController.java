package hello.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	// ログイン画面を表示させる
	@GetMapping("/login")
	public String getLoginPage() {
		return "login.html";
	}
}
