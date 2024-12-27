package ec.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ec.com.services.AdminService;

@Controller
public class AdminRegisterController {

	@Autowired
	private AdminService adminService;
	
	//登録画面の表示
	@GetMapping("/admin/register")
	public String getAdminRegisterPage() {
		return "admin_register.html";
	}
	
	//登録処理
	@PostMapping("/admin/register/process")
	public String adminRegisterProcess(@RequestParam String adminName,
			@RequestParam String adminEmail,
			@RequestParam String password) {
		//もし、createAdminがtrue admin_login.htmlに遷移
		//そうでない場合、admin_register.htmlにとどまります。
		if(adminService.createAdmin(adminEmail, adminName, password)) {
			return "admin_login.html";
		}else {
			return "admin_register.html";
		}
	}
}
