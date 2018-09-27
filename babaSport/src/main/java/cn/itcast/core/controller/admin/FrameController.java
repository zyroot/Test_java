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
@RequestMapping(value="/control")
public class FrameController {

	//商品身体
	@RequestMapping(value = "frame/product_main.do")
	public String productMain(){
		return "frame/product_main";
	}
	//商品left身体
	@RequestMapping(value = "/frame/product_left.do")
	public String product_left(){
		return "frame/product_left";
	}
	//商品right身体
	@RequestMapping(value = "/frame/product_right.do")
	public String product_right(){
		return "frame/product_right";
	}
	//商品list身体
	@RequestMapping(value = "/product/list.do")
	public String list(){
		return "/product/list";
	}
	
}
