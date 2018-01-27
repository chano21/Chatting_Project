package com.chat.site;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.activation.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.chat.commons.CommandMap;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private SqlSession sqlSession;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/viewsql", method = RequestMethod.GET)
	public ModelAndView testsql(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		DriverManagerDataSource d=new DriverManagerDataSource();
		ModelAndView mav = new ModelAndView("/site/cust/cus");
		mav.addObject("test","test");
		return mav;
	}
	@RequestMapping(value="/tesetmap")
    public ModelAndView testMapArgumentResolver(CommandMap commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("");
        
        System.out.println(commandMap.getMap());
        
        return mv;
    }

	
	
}
