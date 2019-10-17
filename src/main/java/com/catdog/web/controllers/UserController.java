package com.catdog.web.controllers;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.catdog.web.domains.UserDTO;
import com.catdog.web.serviceimpls.CustomerServiceImpl;

@Controller
@RequestMapping("/user/*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired Map<String, Object> map;
	
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody UserDTO user) {
		logger.info("AJAX 가 보낸 아이디와 비번 {} ", user.getCid() + ","+ user.getPw());
		HashMap<String, String> map = new HashMap<>();
		map.put("cid", user.getCid());
		map.put("pw", user.getPw());
		logger.info("map에 담긴 아이디와 비번{}", map.get("cid")+ "," +map.get("pw"));
		return map;
	}
}
