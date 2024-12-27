package ec.com.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ec.com.models.entity.Admin;
import ec.com.models.entity.Products;
import ec.com.services.ProductsService;
import jakarta.servlet.http.HttpSession;

@Controller
public class ProductsEditController {
	@Autowired
	private ProductsService productsService;

	@Autowired
	private HttpSession session;

	// 編集画面の表示
	@GetMapping("/product/edit/{productId}")
	public String getProductEditPage(@PathVariable Long productId, Model model) {
		// セッションからログインしている人の情報をadminという変数に格納
		Admin admin = (Admin) session.getAttribute("loginAdminInfo");
		// もしadmin==null ログイン画面にリダイレクトする
		if (admin == null) {
			return "redirect:/admin/login";
		} else {
			// 編集画面に表示させる情報を変数に格納 products
			Products products = productsService.productEditCheck(productId);
			// もしproducts==nullだったら、商品一覧ページにリダイレクトする
			// そうでない場合、編集画面に編集する内容を渡す
			// 編集画面を表示
			if (products == null) {
				return "redirect:/product/list";
			} else {
				model.addAttribute("adminName", admin.getAdminName());
				model.addAttribute("products", products);
				return "product_edit.html";
			}

		}
	}

	// 更新処理をする
	@PostMapping("/product/edit/process")
	public String productsUpdate(@RequestParam String productName, @RequestParam String productCategory,
			@RequestParam MultipartFile productImage, @RequestParam String productDescription,
			@RequestParam Long productId) {
		// セッションからログインしている人の情報をadminという変数に格納
		Admin admin = (Admin) session.getAttribute("loginAdminInfo");
		// もし、admin == nullだったら、ログイン画面にリダイレクトする
		// そうでない場合、
		/**
		 * 現在の日時情報を元に、ファイル名を作成しています。SimpleDateFormatクラスを使用して、日時のフォーマットを指定している。
		 * 具体的には、"yyyy-MM-dd-HH-mm-ss-"の形式でフォーマットされた文字列を取得している。
		 * その後、blogImageオブジェクトから元のファイル名を取得し、フォーマットされた日時文字列と連結して、fileName変数に代入
		 **/
		// ファイルの保存
		// もし、productUpdateの結果がtrueの場合は、商品一覧にリダイレクト
		// そうでない場合、商品編集画面にリダイレクトする
		if (admin == null) {
			return "redirect:/admin/login";
		} else {
			String fileName = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-").format(new Date())
					+ productImage.getOriginalFilename();
			try {
				Files.copy(productImage.getInputStream(), Path.of("src/main/resources/static/product-img/"+fileName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(productsService.productUpdate(productId, productCategory, productDescription, fileName, productName, admin.getAdminId())) {
				return "redirect:/product/list";
			}else {
				return "redirect:/product/edit"+productId;
			}
		}
	
	}

}
