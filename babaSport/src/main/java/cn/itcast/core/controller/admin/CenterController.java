package cn.itcast.core.controller.admin;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理
 * 测试
 * @author Zy
 *
 */
@Controller
public class CenterController {
	public String name() {
		return "";
	}
	
	
	@RequestMapping(value="/test/springmvc.do")
	public String test(String name,Date birthday){
		 
		System.out.println(name+"|"+birthday);
		return "";
	}
}
