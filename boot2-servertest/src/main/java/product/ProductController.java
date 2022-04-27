package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mybatis.MemberService;

@Controller
public class ProductController {
	
	@Autowired
	@Qualifier("productservice")
	ProductService service;
	
	@RequestMapping("/productlist")
	public ModelAndView productlist() {
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> list = service.productlist();
		mv.addObject("productlist", list);
		mv.setViewName("mybatis/productlist");
		
		return mv;
	}
	
	@RequestMapping("/product")
	public ModelAndView product(int code) {
		ModelAndView mv = new ModelAndView();
		ProductDTO dto = service.product(code);
		mv.addObject("product", dto);
		mv.addObject("code", dto.productcode);
		mv.setViewName("mybatis/detailproduct");
		
		return mv;
	}
}
