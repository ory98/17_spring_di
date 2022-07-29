package com.spring.di.asis;

import org.springframework.stereotype.Controller;

@Controller
public class AsIsController {
	
	// 객체의 생성 순서 Controller > Service > Dao
	// 객체가 생성됨과 동시에 클래스 내부에서 다른 객체를 생성한다. >>> 결합력(의존성)이 강하다. 

	AsIsService asIsService = new AsIsService();

}
