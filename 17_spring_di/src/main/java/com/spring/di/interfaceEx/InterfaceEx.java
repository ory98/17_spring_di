package com.spring.di.interfaceEx;

/*
 * 
 * - 클래스가 구현한 인터페이스의 타입의 참조형으로 이를 구현한 클래스의 객체를 생성할 수 있다.
 * - 인터페이스를 자료형으로 작성할 경우 프로그램은 더욱 유연해진다.
 * - 스프링에서 이 개발방법을 지향하고 있다.
 * 
 *  [ 예시 ]
 *  
 *   List<Object> temp1 = new ArrayList<Object>();
 *   List<Object> temp2 = new Vector<Object>();
 *   
 *   Map<Object,Object> temp3 = new HashMap<Object, Object>();
 *   Map<Object,Object> temp4 = new TreeMap<Object, Object>();
 *   
 * */

interface Person {}

class Manager 	implements Person{}
class Employee 	implements Person{}
class Boss 		implements Person{}

public class InterfaceEx {
	
	public static void main(String[] args) {
		
		// 클래스 타입 참조 객체 생성 
//		Manager manager		= new Manager();
//		Employee employee 	= new Employee();
//		Boss boss 			= new Boss();
		
		// 인터페이스 타입 참조 객체 생성 (바꾸는 것을 최소화 하기 위해) 
		Person manager	= new Manager();
		Person employee = new Employee();
		Person boss 	= new Boss();
	}

}
