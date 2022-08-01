package com.spring.di.xmlInjection;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// XML 파일에서 생성된 객체를 스프링 객체에 주입시킨다.

@Controller
public class XmlInjection {
	
	// root-context.xml 파일의 객체를 주입 
	@Autowired
	private SqlSession sqlSession;

}
