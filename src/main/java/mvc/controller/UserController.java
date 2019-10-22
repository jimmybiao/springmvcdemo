package mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.pojo.User;
import mvc.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user_list")
	public String listUsers(Model model) {
		List<User> users=userService.getAllUsers();
		model.addAttribute("users", users);
		return "UserList";
	}
}
